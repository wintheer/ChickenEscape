package winther.chickenescape;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import winther.chickenescape.standard.Player;

/**
 * Created by Winther on 04/11/2016.
 */

public class GameView extends SurfaceView implements Runnable {

    //Is the game playing or not?
    volatile boolean playing;
    private Thread gameThread = null;

    private Player player;

    private Paint paint;
    private Canvas canvas;
    private SurfaceHolder surfaceHolder;

    public GameView(Context context) {
        super(context);

        player = new Player(context);

        surfaceHolder = getHolder();
        paint = new Paint();
    }

    @Override
    public void run() {
        while (playing) {
            update();

            draw();

            control();
        }
    }

    private void draw() {
        if (surfaceHolder.getSurface().isValid()) {

            //TODO, hvorfor skal canvas låses?
            canvas = surfaceHolder.lockCanvas();

            //Tegner en sort baggrund, no shit
            canvas.drawColor(Color.BLACK);

            //TODO Hvad er et bitmap?
            canvas.drawBitmap(player.getBitmap(), player.getX(), player.getY(), paint);

            surfaceHolder.unlockCanvasAndPost(canvas);
        }

    }

    private void control() {


    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {

            //TODO custom steder at trykke på skærmen i stedet?
            case MotionEvent.ACTION_DOWN:

                break;

            case MotionEvent.ACTION_UP:

                break;
        }
        return true;
    }

    private void update() {
        player.update();

    }

    public void pause() {
        playing = false;

        try {
            gameThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void resume() {
        playing = true;

        gameThread = new Thread(this);
        gameThread.start();
    }
}

