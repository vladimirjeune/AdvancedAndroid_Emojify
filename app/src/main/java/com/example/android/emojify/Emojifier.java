package com.example.android.emojify;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;


public class Emojifier {

    public Emojifier() {
    }

    /**
     * DETECTFACES - Static method in the Emojifier class called detectFaces() which detects and
     * logs the number of faces in a given bitmap.
     * @param context - Needed for function calls
     * @param scene - Bitmap that is to be analyzed for faces
     */
    public static int detectFaces(Context context, Bitmap scene) {

        FaceDetector faceDetector = new FaceDetector.Builder(context)
                .build();

        Frame frame = new Frame.Builder().setBitmap(scene).build();
        SparseArray<Face> numberOfFaces = faceDetector.detect(frame);

        return numberOfFaces.size();
    }

}
