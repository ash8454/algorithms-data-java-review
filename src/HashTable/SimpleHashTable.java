package HashTable;

import HashTable.Employee;

public class SimpleHashTable {
    private Employee[] hashtable;

    public SimpleHashTable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1){
                hashedKey = 0;
            } else {
                hashedKey++;
            }
        }
        if (occupied(hashedKey)){
            System.out.println("Sorry, there's already an employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index){
        return hashtable[index] != null;
    }

    public void printHashTable() {
        for(int i=0; i < hashtable.length; i++){
            System.out.println(hashtable[i]);
        }
    }


}
