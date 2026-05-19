/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343479150
 */
public class Verdict {
    //Variable declaration
    private String caseName;
    private String studentVerdict;
    private String reason;
    
    public Verdict() {
        this.caseName = "";
        this.reason = "idk again";
        this.studentVerdict = "still dunno";
    }
    
    public Verdict (String caseName, String verdict, String reason) {
        this.caseName = caseName;
        this.studentVerdict = verdict;
        this.reason = reason;
    }
    
    public void setCaseName(String caseName) {
    this.caseName = caseName;
    }
    public String getCaseName() {
      return caseName;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public String getReason() {
        return reason;
    }
    
    public void setStudentVerdict(String studentVerdict) {
        this.studentVerdict = studentVerdict;
    }
    
    public String getStudentVerdict() {
        return studentVerdict;
    }
    
    public String toString() {
        return "Case name: " + caseName + "Reason: " + reason + "Verdict: " + studentVerdict;
    }
}
