/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343479150
 */
public class IntellectualPropertyCase extends EthicsCase{
    // all declared var from UML
    private String ipType;

    
    // child class constructor of each INTELLECTUAL PROPERTY case object
    public IntellectualPropertyCase(String caseTitle, String description, String category, String ipType){
        super(caseTitle, description, category);
        this.ipType = ipType;
    }
    
    /** METHOD: returns the case's mediaType
     * @return String mediaType 
     */
    public String getMediaType(){
        return  ipType;
    }
    
    @Override
    /** TOSTRING: returns all details regarding Ethic case + INTELLECTUAL PROPERTY case detail
     * @return String 
     */
    public String toString(){
        return  super.toString() + ipType;
    }
}
