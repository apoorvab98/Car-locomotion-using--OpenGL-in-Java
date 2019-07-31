/*
package org.yourorghere; 
import com.sun.opengl.util.FPSAnimator;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.media.opengl.GL;  
import javax.media.opengl.*;   
import javax.media.opengl.glu.GLU;  
import javax.swing.JFrame;  

abstract class Cgassignment implements GLEventListener,KeyListener {  
    private GLU glu = new GLU();  
    private float rotation = 0.0f;  
    private float rotx = 0.0f;
      
       @Override  
    public void display( GLAutoDrawable drawable ) {  
          
    final GL gl = drawable.getGL(); 
    gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );  
    gl.glLoadIdentity();
  
gl.glColor3f(1.0f, 1.0f, 1.0f);
 
   gl.glRotatef(rotation, 0.0f, 1.0f, 0.0f);
  
 gl. glBegin(GL.GL_POLYGON);
    gl.glColor3f(1.0f, 0.25f, 0.3f);
       gl. glVertex3f(1f, 0f, -5.0f);
       gl. glVertex3f(1.5f, 0f, -5.0f);
       gl. glVertex3f(1.5f, 0.5f, -5.0f);
       gl. glVertex3f(3f, 0.5f, -5.0f);
       gl. glVertex3f(3.5f, 0f, -5.0f);
       gl. glVertex3f(3.5f, -0.5f, -5.0f);
       gl. glVertex3f(1f, -0.5f, -5.0f);
   
    gl.glEnd();
       gl. glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 0.0f);
       gl. glVertex3f(1.5f, 0f, -5.0f);
       gl. glVertex3f(1.5f, 0.5f, -5.0f);
       gl. glVertex3f(1.75f, 0.5f, -5.0f);
       gl. glVertex3f(1.9f, 0.5f, -5.0f);
       gl. glVertex3f(1.95f, 0.5f, -5.0f);
       gl. glVertex3f(1.99f, 0.5f, -5.0f);
       gl. glVertex3f(2.0f, 0f, -5.0f);      
       gl. glVertex3f(2.0f, 0.5f, -5.0f);
       
       
    gl.glEnd();
    gl.glBegin(GL.GL_POLYGON);
    gl.glColor3f(1.0f, 1.0f, 0.0f);
       gl. glVertex3f(2.5f, 0f, -5.0f);
       gl. glVertex3f(2.5f, 0.5f, -5.0f);
       gl. glVertex3f(2.75f, 0.5f, -5.0f);
       gl. glVertex3f(2.9f, 0.5f, -5.0f);
       gl. glVertex3f(2.95f, 0.5f, -5.0f);
       gl. glVertex3f(2.99f, 0.5f, -5.0f);
       gl. glVertex3f(3.0f, 0f, -5.0f);
       gl. glVertex3f(3.0f, 0.5f, -5.0f);
       gl.glEnd();
       
       float x1=0.5f;
       float y1=-0.5f;
       float x2,y2;
       //float z1=-0.5f;
      gl.glColor3f(0.5f, 0.5f, 0.0f );
    gl.glBegin(GL.GL_POLYGON);
    gl.glVertex3f(x1,y1,-0.5f);
   for(float angle=1;angle<360.0f;angle+=0.2)
   {
       
       
    //   double angle =Math.toRadians(i);
       //double angle= 2*Math.PI/360;
       x2=(float)(x1+Math.sin(angle)*0.5);
       y2=(float)(y1+Math.cos(angle)*0.5);
       
       gl.glVertex3f(x2,y2,-0.5f);
   }
   gl.glEnd();
   gl.glFlush();
   rotation += 0.02f;

   }  
     
    public void dispose( GLAutoDrawable drawable ) {  
    }  
      
    @Override  
    public void init( GLAutoDrawable drawable ) {  
          
       }  
      
       @Override  
    public void reshape( GLAutoDrawable drawable, int x, int y, int width, int height ) {  
          
    final GL gl = drawable.getGL();
    if( height <= 0 )  
    height = 1;  
                  
    final float h = ( float ) width / ( float ) height;  
    gl.glViewport( 0, 0, width, height );  
    gl.glMatrixMode( GL.GL_PROJECTION );  
    gl.glLoadIdentity();  
              
    glu.gluPerspective( 45.0f, h, 1.0, 20.0 );  
    gl.glMatrixMode( GL.GL_MODELVIEW );  
    gl.glLoadIdentity();  
       }  
      
    public static void main( String[] args ) {  
          
    GLCapabilities capabilities=new GLCapabilities();

    // The canvas

    final GLCanvas glcanvas=new GLCanvas(capabilities);
      
      
    final GLCanvas gc = new GLCanvas();  
    Cgassignment cube=new Cgassignment() {
        public void keyTyped(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void keyPressed(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void keyReleased(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }; 
              
    gc.addGLEventListener( cube );  
    gc.setSize( 400, 400 );  
              
    final JFrame frame = new JFrame( " 3D cube" );  
    frame.add(gc);  
    frame.setSize(600,500);  
    frame.setVisible(true);   
      
    final FPSAnimator animator = new FPSAnimator(gc, 200,true);  
    animator.start();  
       }  

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }        
} 



*/

/*

public class Cgassignment implements GLEventListener {
    static GL gg;
    public static void main(String args[]) throws Exception {
        final JSlider slider1 = new JSlider(JSlider.HORIZONTAL, 0, 255, 25);
        final JSlider slider2 = new JSlider(JSlider.HORIZONTAL, 0, 255, 25);
        final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 255, 25);
    JFrame f = new JFrame("Draw a Red Line");
    f.setSize(500, 500);
    f.setLocation(100, 100);
    f.setResizable(false);
    f.setLayout(new BorderLayout());
    JPanel p1 = new JPanel() {
        Point pointStart = null;
        Point pointEnd   = null;
        {
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    pointStart = e.getPoint();
                    System.out.println("pressed "+pointStart.x+" "+ pointStart.y+" "+ pointEnd.x+" "+ pointEnd.y);
                    
                    /*gg.glColor3f(1.0f, 0.0f, 0.0f );
                    gg.glBegin(GL.GL_LINES);
                    gg.glVertex2i(2,5);
                    gg.glVertex2i(20,30);
                    gg.glEnd();*/
/*
                }

                public void mouseReleased(MouseEvent e) {
                    
                    
                    System.out.println("released "+pointStart.x+" "+ pointStart.y+" "+ pointEnd.x+" "+ pointEnd.y);
                    
                    repaint();
                    
                    
                }
            });
            
            
            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseMoved(MouseEvent e) {
                    
                    pointEnd = e.getPoint();
                    //System.out.println("moved "+pointStart.x+" "+ pointStart.y+" "+ pointEnd.x+" "+ pointEnd.y);
                    
                }

                public void mouseDragged(MouseEvent e) {
                    if (pointStart != null){
                    pointEnd = e.getPoint();
                    System.out.println("dragged "+pointStart.x+" "+ pointStart.y+" "+ pointEnd.x+" "+ pointEnd.y);
                    
                    }
                }
            });
        }
        
        
        public void paint(Graphics g) {
            //super.paint(g);
            if (pointStart != null && pointEnd !=null) {
                int val1 = slider.getValue();
                int val2 = slider1.getValue();
                int val3 = slider2.getValue();
                float[] hsb = Color.RGBtoHSB(val1, val2, val3, null);
                g.setColor(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
                System.out.println("paint "+pointStart.x+" "+ pointStart.y+" "+ pointEnd.x+" "+ pointEnd.y);
                g.drawLine(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);
                
            }
        }
    };
    
    

    f.add(p1);
    f.setVisible(true); 
    
    
    JFrame f1 = new JFrame("trackbars");
    f1.setSize(800, 100);
    f1.setLocation(0, 0);
    f1.setResizable(false);
    
    JPanel p=new JPanel();
    p.setLayout(new GridLayout(1,3));
    
    slider.setPaintLabels(true);
    slider.setMinorTickSpacing(10);  
    slider.setMajorTickSpacing(50);
    slider.setPaintTicks(true);
    slider.setName("red");
    p.add(slider);
    
    
    
    slider1.setPaintLabels(true);
    slider1.setMinorTickSpacing(10);  
    slider1.setMajorTickSpacing(50);
    slider1.setPaintTicks(true);
    slider1.setName("green");
    p.add(slider1);
    
    
    
    
    slider2.setPaintLabels(true);
    slider1.setMinorTickSpacing(10);
    slider2.setMajorTickSpacing(50);
    slider2.setPaintTicks(true);
    slider2.setName("blue");
    p.add(slider2);
     
    f1.add(p);
    f1.setVisible(true); 
}
    
    
    

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        gg=gl;
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();

        // Move the "drawing cursor" around
        
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}


*/

 //Keyboard key;
 /*gl.glRotatef(rotx,1.0f,0.0f,0.0f);
   gl. glRotatef(  rotation,0.0f, 1.0f, 0.0f );
   
   gl.glRotatef(rotation, 0.0f, 1.0f, 0.0f);


    gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-40.0f,0.0f,15.0f);
        gl.glVertex3f(40.0f,0.0f,15.0f);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(40.0f,-15.0f,15.0f);
        gl.glVertex3f(-40.0f,-15.0f,15.0f);
    gl.glEnd();


    gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(40.0f,0.0f,-15.0f);
        gl.glVertex3f(40.0f,0.0f,15.0f);
        gl.glVertex3f(40.0f,-15.0f,15.0f);
        gl.glVertex3f(40.0f,-15.0f,-15.0f);
    gl.glEnd();
    gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-40.0f,0.0f,-15.0f);
        gl.glVertex3f(-40.0f,0.0f,15.0f);
        gl.glVertex3f(-40.0f,-15.0f,15.0f);
        gl.glVertex3f(-40.0f,-15.0f,-15.0f);
    gl.glEnd();
    gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-40.0f,0.0f,-15.0f);
        gl.glVertex3f(40.0f,0.0f,-15.0f);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(40.0f,-15.0f,-15.0f);
        gl.glVertex3f(-40.0f,-15.0f,-15.0f);
    gl.glEnd();
    gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-40.0f,0.0f,15.0f);
        gl.glVertex3f(-40.0f,0.0f,-15.0f);
        gl.glVertex3f(40.0f,0.0f,-15.0f);
        gl.glVertex3f(40.0f,0.0f,15.0f);
    gl.glEnd();
    gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-40.0f,-15.0f,15.0f);
        gl.glVertex3f(-40.0f,-15.0f,-15.0f);
        gl.glVertex3f(40.0f,-15.0f,-15.0f);
        gl.glVertex3f(40.0f,-15.0f,15.0f);
    gl.glEnd();

    gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-20.0f,0.0f,15.0f);
        gl.glVertex3f(-10.0f,10.0f,15.0f);
        gl.glVertex3f(20.0f,10.0f,15.0f);
        gl.glVertex3f(25.0f,0.0f,15.0f);
    gl.glEnd();
    gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-20.0f,0.0f,-15.0f);
        gl.glVertex3f(-10.0f,10.0f,-15.0f);
        gl.glVertex3f(20.0f,10.0f,-15.0f);
        gl.glVertex3f(25.0f,0.0f,-15.0f);
    gl.glEnd();
    gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-10.0f,10.0f,15.0f);
        gl.glVertex3f(-10.0f,10.0f,-15.0f);
        gl.glVertex3f(20.0f,10.0f,-15.0f);
        gl.glVertex3f(20.0f,10.0f,15.0f);
    gl.glEnd();
    gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-10.0f,10.0f,15.0f);
        gl.glVertex3f(-20.0f,0.0f,15.0f);
        gl.glVertex3f(-20.0f,0.0f,-15.0f);
        gl.glVertex3f(-10.0f,10.0f,-15.0f);
    gl.glEnd();
    gl.glBegin(GL.GL_POLYGON);
       gl. glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(20.0f,10.0f,15.0f);
        gl.glVertex3f(20.0f,10.0f,-15.0f);
        gl.glVertex3f(25.0f,0.0f,-15.0f);
        gl.glVertex3f(25.0f,0.0f,15.0f);
    gl.glEnd();
    gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-30.0f,-15.0f,15.0f);
        gl.glVertex3f(-30.0f,-15.0f,-15.0f);
        gl.glVertex3f(30.0f,-15.0f,-15.0f);
        gl.glVertex3f(30.0f,-15.0f,15.0f);
    gl.glEnd();
 */



package org.yourorghere; 
import com.sun.opengl.util.FPSAnimator;
import java.awt.Button;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import javax.media.opengl.GL;  
import javax.media.opengl.*;   
import javax.media.opengl.glu.GLU; 
import javax.swing.JFrame;  
import javax.swing.JPanel;
      
    public class Cgassignment implements GLEventListener {  
    private GLU glu = new GLU();  
    private float rotation = 0.0f;  
    static   JFrame frame=null;
    static  JPanel p;
    @Override  
    public void display( GLAutoDrawable drawable ) {  
        final GL gl = drawable.getGL(); 
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );  
        gl.glLoadIdentity();
 
        float x1=1.5f;
        float y1=1.5f;
        float x2,y2;
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl. glRotatef(rotation,0.0f,1.0f,0.0f );
        x1=1f;
        y1=-0.2f;
        gl.glColor3f(1.0f,0.0f, 0.0f);
        gl. glBegin(GL.GL_TRIANGLE_FAN);
        gl. glVertex3f(x1, y1, -5.0f);
        for (float angle=0f;angle<180.0f;angle+=0.2)
        {
            x2 = (float) (x1+sin(angle)*0.2);
            y2 = (float) (y1+cos(angle)*0.2);
            gl. glVertex3f(x2, y2, -5.0f);
       }
       gl.glEnd();
       x1=1f;
       y1=-0.7f;
       gl.glColor3f(1.0f, 0.0f, 0.0f);
       gl. glBegin(GL.GL_TRIANGLE_FAN);
       gl. glVertex3f(x1, y1, -5.0f);
       for (float angle=0f;angle<180.0f;angle+=0.2)
       {
            x2 = (float) (x1+sin(angle)*0.19);
            y2 = (float) (y1+cos(angle)*0.19);
            gl. glVertex3f(x2, y2, -5.0f);
       }
       gl.glEnd();
       
       gl.glColor3d(1,1,1.5);
       gl. glBegin(GL.GL_POLYGON);
       gl. glVertex3f(1f, 0f, -5.0f);
       gl. glVertex3f(4.5f, 0f, -5.0f);
       gl. glVertex3f(4.5f, -0.9f, -5.0f);
       gl. glVertex3f(1f, -0.9f, -5.0f);
       gl.glEnd();
       
       gl. glBegin(GL.GL_POLYGON);
       gl. glVertex3f(1.5f, 0f, -5.0f);
       gl. glVertex3f(2.2f, 0.8f, -5.0f);
       gl. glVertex3f(3.2f, 0.8f, -5.0f);
       gl. glVertex3f(3.9f, 0f, -5.0f);
       gl.glEnd();
       
       gl.glColor3f(0f,1f, 0f);
       gl. glBegin(GL.GL_POLYGON);
       gl. glVertex3f(2.1f, 0f, -5.0f);
       gl. glVertex3f(2.6f, 0f, -5.0f);
       gl. glVertex3f(2.6f, 0.7f, -5.0f);
       gl. glVertex3f(2.1f, 0.7f, -5.0f);
       gl.glEnd();
       
       gl.glColor3f(0f,1f, 0f);
       gl. glBegin(GL.GL_POLYGON);
       gl. glVertex3f(2.8f, 0f, -5.0f);
       gl. glVertex3f(3.3f, 0f, -05.0f);
       gl. glVertex3f(3.3f, 0.7f, -5.0f);
       gl. glVertex3f(2.8f, 0.7f, -5.0f);
       gl.glEnd();
 
       x1=2.2f;
       y1=-1f;
       gl.glColor3f(0f,0f,1);
       gl. glBegin(GL.GL_TRIANGLE_FAN);
       gl. glVertex3f(x1, y1, -5.0f);
       for (float angle=0f;angle<361.0f;angle+=0.2)
       {
            x2 = (float) (x1+sin(angle)*0.5);
            y2 = (float) (y1+cos(angle)*0.5);
            gl. glVertex3f(x2, y2, -5.0f);
       }
       gl.glEnd();
       
       float x11=3.5f;
       float y11=-1f;
       float x22,y22;
       gl.glColor3f(0f,0f,1);
       gl. glBegin(GL.GL_TRIANGLE_FAN);
       gl. glVertex3f(x11, y11, -5.0f);
       for (float angle=0f;angle<361.0f;angle+=0.2)
        {
            x22 = (float) (x11+sin(angle)*0.5);
            y22 = (float) (y11+cos(angle)*0.5);
            gl. glVertex3f(x22, y22, -5.0f);
        }
        gl.glEnd();
        gl.glFlush();  
        rotation += 0.01f;
    }  
     
    public void dispose( GLAutoDrawable drawable ) {  
    }  
      
    @Override  
    public void init( GLAutoDrawable drawable ) {  
    }  
      
    @Override  
    public void reshape( GLAutoDrawable drawable, int x, int y, int width, int height ) {    
        final GL gl = drawable.getGL();
        if( height <= 0 )  
            height = 1;  

        final float h = ( float ) width / ( float ) height;  
        gl.glViewport( 0, 0, width, height );  
        gl.glMatrixMode( GL.GL_PROJECTION );  
        gl.glLoadIdentity();  

        glu.gluPerspective( 45.0f, h, 1.0, 20.0 );  
        gl.glMatrixMode( GL.GL_MODELVIEW );  
        gl.glLoadIdentity();  
    }  
      
    public static void main( String[] args ) {     
        GLCapabilities capabilities=new GLCapabilities();
        // The canvas
        final GLCanvas glcanvas=new GLCanvas(capabilities);  
        final GLCanvas gc = new GLCanvas();  
        Cgassignment cube = new Cgassignment();             
        gc.addGLEventListener( cube );  
        gc.setSize( 400, 400 );            
        frame = new JFrame( "Car locomotion" );  
        frame.add(gc);  
        frame.setSize(600,500);  
        frame.setVisible(true); 
        Button b= new Button();
        frame.add(b);
      
        final FPSAnimator animator = new FPSAnimator(gc, 200,true);  
        animator.start();  
    }  

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 

