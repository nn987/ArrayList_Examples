 

ArrayList <Photo> photos = new ArrayList <Photo> ();

void setup() {
  size(200,200);
  for (int i=0; i<10; i++) {
    float flipcoin = random(1);
    if (flipcoin>0.3) { photos.add(new Photo(i,false)); }
    else { photos.add(new Photo(i,true)); }
  }

  // sort ArrayList here on the boolean selected

  for (Photo p : photos) {
    println(p.selected + "," + p.index);
  }

  // sorted ArrayList with the true ones first and after that the false ones
}

class Photo {
  int index;
  boolean selected;
  int a,b,c,d;
  float e,f,g,h;
  PImage i,j,k;
  
  Photo(int index, boolean selected) {
    this.index = index;
    this.selected = selected;
  }
}

