/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343479150
 */
public class MisinfomationCase extends EthicsCase{
    // all declared var from UML
    private String mediaType;

    
    // child class constructor of each MISINFOMATION case object
    public MisinfomationCase(String caseTitle, String description, String category, String mediaType){
        super(caseTitle, description, category);
        this.mediaType = mediaType;
    }
    
    /** METHOD: returns the case's mediaType
     * @return String mediaType 
     */
    public String getMediaType(){
        return  mediaType;
    }
    
    @Override
    /** TOSTRING: returns all details regarding Ethic case + MISINFOMATION case detail
     * @return String 
     */
    public String toString(){
        return  super.toString() + mediaType;
    }
}
