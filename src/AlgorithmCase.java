
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343479150
 */
public class AlgorithmCase extends EthicsCase{
    // all declared var from UML
    private String biasType;

    // child class constructor of each ALGORITHM case object
    public AlgorithmCase(String caseTitle, String description, String category, String biasType){
        super(caseTitle, description, category);
        this.biasType = biasType;
    }
    
    // METHOD: getter method
    public String getBiasType(){
        return  biasType;
    }
    
    @Override
    /** TOSTRING: returns all details regarding Ethic case + ALGORITHM case detail
     * @return String 
     */
    public String toString(){
        return  super.toString() + biasType;
    }
}
