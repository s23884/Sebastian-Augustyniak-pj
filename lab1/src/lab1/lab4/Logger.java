/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.lab4;


import javax.print.attribute.standard.Severity;

public interface Logger {
    
   public Severity Error = Severity.ERROR;
   public Severity Warning = Severity.WARNING;
   public Severity Report = Severity.REPORT;
   
 public void LogMessage (Severity Waring, EventSource, String message);
}
