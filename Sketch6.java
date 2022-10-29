
void setup(){
  size(800,800);
  rectMode(CENTER);
}
void draw(){
  
  squares(width/2,height/2,800,0);
 noLoop();
}

void squares(int locX,int locY,float l, double angle){
  l*=.70; // shrinks the square each time by a multiple of .70
  pushMatrix();
  fill(random(250), random(250), random(250));
   translate(width/2,height/2);//keeps the square at the center
   rotate((float)angle);//rotates the square by 90 degrees
    rect(0,0,l,l);
    popMatrix();//push and pop reset the cordinates
    
    if(l>=25) squares(locX,locY,l,angle+Math.PI/4);
 
 
}
