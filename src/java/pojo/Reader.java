package pojo;
// Generated Apr 21, 2016 7:11:11 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Reader generated by hbm2java
 */
public class Reader  implements java.io.Serializable {


     private Integer readerId;
     private Line line;
     private String readerName;
     private Date registerDate;
     private Set sensors = new HashSet(0);

    public Reader() {
    }

    public Reader(Line line, String readerName, Date registerDate, Set sensors) {
       this.line = line;
       this.readerName = readerName;
       this.registerDate = registerDate;
       this.sensors = sensors;
    }
   
    public Integer getReaderId() {
        return this.readerId;
    }
    
    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }
    public Line getLine() {
        return this.line;
    }
    
    public void setLine(Line line) {
        this.line = line;
    }
    public String getReaderName() {
        return this.readerName;
    }
    
    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }
    public Date getRegisterDate() {
        return this.registerDate;
    }
    
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
    public Set getSensors() {
        return this.sensors;
    }
    
    public void setSensors(Set sensors) {
        this.sensors = sensors;
    }




}


