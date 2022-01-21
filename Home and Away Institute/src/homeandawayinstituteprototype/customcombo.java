package homeandawayinstituteprototype;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Team5
 */
public class customcombo {
String key;
String value;
public customcombo(String key, String value) {
this.key= key;
this.value = value;
}
public String getKey() {
return key;
}
public void setKey(String key) {
this.key= key;
}
public String getValue() {
return value;
}
public void setValue(String value) {
this.value = value;
}
@Override
public String toString(){
return key;
}
}