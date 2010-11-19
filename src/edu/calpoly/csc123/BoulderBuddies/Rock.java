package edu.calpoly.csc123.BoulderBuddies;
public class Rock
{
	private String name = "";
	public int ID = 0;
	public int BODY_ID = 1;
	public int EYES_ID = 1;
	public int MOUTH_ID = 0;
	public int NOSE_ID = 0;
	public int HAT_ID = 0;
	public int MOUSTACHE_ID = 0;//
	public int BEARD_ID = 0;//
	public int EARRING_ID = 0;//
	public int EYEBROW_ID = 0;//
	public int GLASSES_ID = 0;//
	public Rock()
	{
		
	}
	public void setID(int id){ID=id;}
	public void setBodyID(int id){BODY_ID=id;}
	public void setEyesID(int id){EYES_ID=id;}
	public void setMouthID(int id){MOUTH_ID=id;}
	public void setHatID(int id){HAT_ID=id;}
	public void setMoustacheID(int id){MOUSTACHE_ID=id;}
	public void setBeardID(int id){BEARD_ID=id;}
	public void setEarringID(int id){EARRING_ID=id;}
	public void setEyebrowID(int id){EYEBROW_ID=id;}
	public void setGlassesID(int id){GLASSES_ID=id;}
	public void setName(String nom){name=nom;}
}