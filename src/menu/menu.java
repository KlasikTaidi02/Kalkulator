/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;


public class menu  extends JComponent{

    /**
     * @return the event
     */
    public menuEvent getEvent() {
        return event;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(menuEvent event) {
        this.event = event;
    }
    
    private menuEvent event;
    
    private MigLayout layout;
    
    //Mmebuat struktur menu beserta namanya
    private String  [][] MenuItems =  new String [][]
            
    {
        {"Rumus","Kecepatan Tempuh","Headway","Jumlah Kendaraan", "Load Factory"},
        {"Credit"}
            
         //menu utama (Rumus, Credit)
            
         //submenu (Kecepatan Tempuh","Headway","Jumlah Kendaraan", "Load Factory")   
    };
    
    public menu()
    {
        init();
    }
    
    public String getItemsName(int index, int subindex)
    {
        
       return   MenuItems[index][subindex];
        
    }
    
    
    private void init()
    {
        layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill");
        setLayout(layout);
        
        //inisialisasi item menu
        for(int i = 0;i<MenuItems.length;i++)
        {
            addMenu(MenuItems[i][0],i);
        }
                 
    }
    
    private void addMenu(String menuName, int index)
    {
        int length = MenuItems[index].length;
        
        //memasukkan menu utama
        menuItem item = new menuItem(menuName, index,length >1);
        
        //menasukkan submenu
        item.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                if(length>1)
                {
                  if(!item.isSelected())
                  {
                      //menampilkan submenu
                        item.setSelected(true);
                        addSubmenu(item, index, length,getComponentZOrder(item) );  
                  }else
                  {     //menyembungikan submenu
                     hideMenu(item,index) ;   
                     item.setSelected(false);
                  }
                  
                }
                else
                {
                   if(event!=null)
                   {
                      event.selected(index, 0);
                   } 
                   
                }

            }
        
        });
        
        add(item);
        revalidate();
        repaint();
        
    }
    
    private void addSubmenu(menuItem item, int index, int length, int indexZorder)
    {
        JPanel panel= new JPanel(new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill"));
        panel.setName(index+"");
        panel.setOpaque(false);
        
        for(int i = 1;i<length;i++)
        {
            menuItem subItem = new menuItem(MenuItems[index][i],i, false );
            subItem.addActionListener(new ActionListener()
            {
                @Override
                public void  actionPerformed(ActionEvent ae)
                {
                    if(event!=null)
                    {
                        event.selected(index, subItem.getIndex());
                    }
                }
     
            });
            
            
            
            
            subItem.initSubMenu(i, length);
            panel.add(subItem);
            
        }
        
        add(panel,"h 0!", indexZorder+1);
        revalidate();
        repaint();
        menuAnimation.showMenu(panel, item, layout, true);
        
    }
    
    private void hideMenu(menuItem item, int index)
    {
        for(Component com:getComponents())
        {
            if(com instanceof JPanel && com.getName() != null &&  com.getName().equals(index+""))
            {
               com.setName(null);
               menuAnimation.showMenu(com, item, layout, false);
               break;
            }
            
        }
        
    }
            
            
    
}
