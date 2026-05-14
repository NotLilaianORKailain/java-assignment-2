/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343479150
 */
public class PrivacyCase extends EthicsCase{
    // all declared var from UML
    private String dataType;

    
    // child class constructor of each PRIVACY case object
    public PrivacyCase(String caseTitle, String description, String category, String dataType){
        super(caseTitle, description, category);
        this.dataType = dataType;
    }
    
    /** METHOD: returns the case's dataType
     * @return String dataType 
     */
    public String getDataType(){
        return  dataType;
    }
    
    @Override
    /** TOSTRING: returns all details regarding Ethic case + PRIVACY case detail
     * @return String 
     */
    public String toString(){
        return  super.toString() + dataType;
    }
}
