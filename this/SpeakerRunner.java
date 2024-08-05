class SpeakerRunner
{
public static void main(String [] args)
{
Speaker speaker=new Speaker('m');
speaker.brand="sony";
speaker.setCost(3700);
speaker.display();

Speaker speaker1=new Speaker('L');
speaker1.brand="apple";
speaker1.setCost(45700);
speaker1.display();

Speaker speaker2=new Speaker('s');
speaker2.brand="jbl";
speaker2.setCost(5000);
speaker2.display();
}
}
