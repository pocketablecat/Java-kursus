public class Kasutaja{
  int aegSees=0;
  int sisenemiseAeg=-1; //-1 näitab et pole sees
  int c=0;
  public void sisenes(int aeg){
	 if(kasSees()){throw new RuntimeException("Juba sees");}
	 sisenemiseAeg=aeg;
	 c++;
  }
  public void lahkus(int aeg){
	if(!kasSees()){throw new RuntimeException("pole sees");}
	 int kauaSees=aeg-sisenemiseAeg;
	 aegSees+=kauaSees;
	 sisenemiseAeg=-1;
  }
 public int loendus(){
	return c;
  }
  public boolean kasSees(){
     return sisenemiseAeg!=-1;
  }
  public int kokkuSees(int aeg){
  if(kasSees()){
	return aegSees+(aeg-sisenemiseAeg);
  }
     return aegSees;
  }
  
}