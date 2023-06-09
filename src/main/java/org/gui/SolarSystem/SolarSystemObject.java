package org.gui.SolarSystem;

import com.jogamp.opengl.GL2;
import org.gui.proiect.Texture.TextureReader;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class SolarSystemObject {
    protected float[] objCoordinates;
    protected float objRadius;
    protected float[] objColor;
    protected int objTextureId;

    public SolarSystemObject(float[] coordinates, float radius, float[] color, int objTextureId) {
        this.objCoordinates = coordinates;
        this.objRadius = radius;
        this.objColor = color;
        this.objTextureId = objTextureId;
    }
    void drawSolarSystemObject(GL2 gl){
        throw new NotImplementedException();
    }
}
