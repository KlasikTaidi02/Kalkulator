/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import javax.swing.JButton;
/**
 *
 * @author User
 */
public class menuItem extends JButton {

    
    
    private int index;
    private boolean subMenuAble;
    
    private int subMenuindex;
    private int length;
    
    public menuItem(String name, int index ,boolean subMenuAble)
    {
        super(name);
        this.index = index;
        this.subMenuAble = subMenuAble;
    }
    
    public void initSubMenu(int subMenuindex, int length)
    {
        this.setSubMenuindex(subMenuindex);
        this.length = length;
        setContentAreaFilled(false);
    }
    
    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the subMenuAble
     */
    public boolean isSubMenuAble() {
        return subMenuAble;
    }

    /**
     * @param subMenuAble the subMenuAble to set
     */
    public void setSubMenuAble(boolean subMenuAble) {
        this.subMenuAble = subMenuAble;
    }

    /**
     * @return the subMenuindex
     */
    public int getSubMenuindex() {
        return subMenuindex;
    }

    /**
     * @param subMenuindex the subMenuindex to set
     */
    public void setSubMenuindex(int subMenuindex) {
        this.subMenuindex = subMenuindex;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
    
}
