

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343479150
 */
public class EthicsCase {
    // all declared var from UML
    private String caseTitle;
    private String description;
    private String category;
    public Verdict verdict;
    
    // constructor of each case object
    public EthicsCase(String caseTitle, String description, String category){
        this.caseTitle = caseTitle;
        this.description = description;
        this.category = category;
        this.verdict = new Verdict();
    }
    
    // METHODS: all getter methods
    public String getCaseTitle(){
        return  caseTitle;
    }
    public String getCaseDescription(){
        return  description;
    }
    public String getCaseCategory(){
        return  category;
    }
    
    @Override
    /** TOSTRING: returns all details regarding a case
     * @return String 
     */
    public String toString(){
        return  caseTitle + description + category;
    }
}
