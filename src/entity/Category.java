package entity;

public class Category {
   public int id;
   public String name;
   public int spend;
   public int recordNumber;

   public int getSpend() {
	   return spend;
   }
   
   public void setSpend(int spend) {
	   this.spend=spend;
   }
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRecordNumber() {
	return recordNumber;
}

public void setRecordNumber(int recordNumber) {
	this.recordNumber = recordNumber;
}
   
public String toString() {
	return name;
}
}
