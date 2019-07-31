
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

