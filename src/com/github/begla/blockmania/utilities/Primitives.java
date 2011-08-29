/*
 * Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.begla.blockmania.utilities;

import com.github.begla.blockmania.Configuration;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import static org.lwjgl.opengl.GL11.*;

/**
 * A collection of some basic primitives.
 *
 * @author Benjamin Glatzel <benjamin.glatzel@me.com>
 */
public class Primitives {

    /**
     * @param scaleX Scale along the x-axis
     * @param scaleY Scale along the y-axis
     * @param scaleZ Scale along the z-axis
     * @param x      Position on the x-axis
     * @param y      Position on the y-axis
     * @param z      Position on the z-axis
     */
    public static void drawCloud(float scaleX, float scaleY, float scaleZ, float x, float y, float z) {
        // Front face
        GL11.glColor3f(0.99f, 0.99f, 0.99f);
        GL11.glTexCoord2f(0.5f, 0.0f);
        GL11.glVertex3f(-0.5f * scaleX + x, -0.5f * scaleY + y, 0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.5f, 0.0f);
        GL11.glVertex3f(0.5f * scaleX + x, -0.5f * scaleY + y, 0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.5f, 0.5f);
        GL11.glVertex3f(0.5f * scaleX + x, 0.5f * scaleY + y, 0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.0f, 0.5f);
        GL11.glVertex3f(-0.5f * scaleX + x, 0.5f * scaleY + y, 0.5f * scaleZ + z);

        // Back Face
        GL11.glColor3f(0.99f, 0.99f, 0.99f);
        GL11.glTexCoord2f(0.5f, 0.0f);
        GL11.glVertex3f(-0.5f * scaleX + x, -0.5f * scaleY + y, -0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.5f, 0.5f);
        GL11.glVertex3f(-0.5f * scaleX + x, 0.5f * scaleY + y, -0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.0f, 0.5f);
        GL11.glVertex3f(0.5f * scaleX + x, 0.5f * scaleY + y, -0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(0.5f * scaleX + x, -0.5f * scaleY + y, -0.5f * scaleZ + z);

        // Top Face
        GL11.glColor3f(1f, 1f, 1f);
        GL11.glTexCoord2f(0.0f, 0.5f);
        GL11.glVertex3f(-0.5f * scaleX + x, 0.5f * scaleY + y, -0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(-0.5f * scaleX + x, 0.5f * scaleY + y, 0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.5f, 0.0f);
        GL11.glVertex3f(0.5f * scaleX + x, 0.5f * scaleY + y, 0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.5f, 0.5f);
        GL11.glVertex3f(0.5f * scaleX + x, 0.5f * scaleY + y, -0.5f * scaleZ + z);

        // Bottom Face
        GL11.glColor3f(0.91f, 0.91f, 0.91f);
        GL11.glTexCoord2f(0.5f, 0.5f);
        GL11.glVertex3f(-0.5f * scaleX + x, -0.5f * scaleY + y, -0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.0f, 0.5f);
        GL11.glVertex3f(0.5f * scaleX + x, -0.5f * scaleY + y, -0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(0.5f * scaleX + x, -0.5f * scaleY + y, 0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.5f, 0.0f);
        GL11.glVertex3f(-0.5f * scaleX + x, -0.5f * scaleY + y, 0.5f * scaleZ + z);

        // Right face
        GL11.glColor3f(0.99f, 0.99f, 0.99f);
        GL11.glTexCoord2f(0.5f, 0.0f);
        GL11.glVertex3f(0.5f * scaleX + x, -0.5f * scaleY + y, -0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.5f, 0.5f);
        GL11.glVertex3f(0.5f * scaleX + x, 0.5f * scaleY + y, -0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.0f, 0.5f);
        GL11.glVertex3f(0.5f * scaleX + x, 0.5f * scaleY + y, 0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(0.5f * scaleX + x, -0.5f * scaleY + y, 0.5f * scaleZ + z);

        // Left Face
        GL11.glColor3f(0.99f, 0.99f, 0.99f);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(-0.5f * scaleX + x, -0.5f * scaleY + y, -0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.5f, 0.0f);
        GL11.glVertex3f(-0.5f * scaleX + x, -0.5f * scaleY + y, 0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.5f, 0.5f);
        GL11.glVertex3f(-0.5f * scaleX + x, 0.5f * scaleY + y, 0.5f * scaleZ + z);
        GL11.glTexCoord2f(0.0f, 0.5f);
        GL11.glVertex3f(-0.5f * scaleX + x, 0.5f * scaleY + y, -0.5f * scaleZ + z);
    }

    /**
     * Draws a simple gradient skybox.
     *
     * @param brightness The brightness of the skybox.
     */
    public static void drawSkyBox(float brightness) {
        Vector3f skyColor = new Vector3f(0.72f * brightness, 0.78f * brightness, 1.0f * brightness);
        Vector3f skyColor2 = new Vector3f(0.84f * brightness, 0.88f * brightness, 1f * brightness);

        // Front face
        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(-0.5f, 0.0f, 0.5f);
        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(0.5f, 0.0f, 0.5f);
        GL11.glColor3f(skyColor.x, skyColor.y , skyColor.z );
        GL11.glVertex3f(0.5f, 0.5f, 0.5f);
        GL11.glColor3f(skyColor.x , skyColor.y , skyColor.z );
        GL11.glVertex3f(-0.5f, 0.5f, 0.5f);

        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(-0.5f, -0.5f, 0.5f);
        GL11.glVertex3f(0.5f, -0.5f, 0.5f);
        GL11.glVertex3f(0.5f, 0.0f, 0.5f);
        GL11.glVertex3f(-0.5f, 0.0f, 0.5f);

        // Back Face
        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(-0.5f, 0.0f, -0.5f);
        GL11.glColor3f(skyColor.x , skyColor.y , skyColor.z );
        GL11.glVertex3f(-0.5f, 0.5f, -0.5f);
        GL11.glColor3f(skyColor.x , skyColor.y , skyColor.z );
        GL11.glVertex3f(0.5f, 0.5f, -0.5f);
        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(0.5f, 0f, -0.5f);

        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(-0.5f, -0.5f, -0.5f);
        GL11.glVertex3f(-0.5f, 0.0f, -0.5f);
        GL11.glVertex3f(0.5f, 0.0f, -0.5f);
        GL11.glVertex3f(0.5f, -0.5f, -0.5f);

        // Right face
        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(0.5f, 0f, -0.5f);
        GL11.glColor3f(skyColor.x , skyColor.y , skyColor.z );
        GL11.glVertex3f(0.5f, 0.5f, -0.5f);
        GL11.glColor3f(skyColor.x , skyColor.y , skyColor.z );
        GL11.glVertex3f(0.5f, 0.5f, 0.5f);
        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(0.5f, 0f, 0.5f);

        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(0.5f, -0.5f, -0.5f);
        GL11.glVertex3f(0.5f, 0.0f, -0.5f);
        GL11.glVertex3f(0.5f, 0.0f, 0.5f);
        GL11.glVertex3f(0.5f, -0.5f, 0.5f);


        // Left Face
        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(-0.5f, 0f, -0.5f);
         GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(-0.5f, 0f, 0.5f);
        GL11.glColor3f(skyColor.x , skyColor.y , skyColor.z );
        GL11.glVertex3f(-0.5f, 0.5f, 0.5f);
        GL11.glColor3f(skyColor.x , skyColor.y , skyColor.z );
        GL11.glVertex3f(-0.5f, 0.5f, -0.5f);

        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(-0.5f, -0.5f, -0.5f);
        GL11.glVertex3f(-0.5f, -0.5f, 0.5f);
        GL11.glVertex3f(-0.5f, 0.0f, 0.5f);
        GL11.glVertex3f(-0.5f, 0.0f, -0.5f);

        // Top Face
        GL11.glColor3f(skyColor.x , skyColor.y , skyColor.z );
        GL11.glVertex3f(-0.5f, 0.5f, -0.5f);
        GL11.glVertex3f(-0.5f, 0.5f, 0.5f);
        GL11.glVertex3f(0.5f, 0.5f, 0.5f);
        GL11.glVertex3f(0.5f, 0.5f, -0.5f);

        // Bottom Face
        GL11.glColor3f(skyColor2.x, skyColor2.y, skyColor2.z);
        GL11.glVertex3f(-0.5f, -0.5f, -0.5f);
        GL11.glVertex3f(0.5f, -0.5f, -0.5f);
        GL11.glVertex3f(0.5f, -0.5f, 0.5f);
        GL11.glVertex3f(-0.5f, -0.5f, 0.5f);
    }

    /**
     * Draws the outline of a chunk.
     */
    public static void drawChunkOutline() {
        glLineWidth(2.0f);
        glColor3f(255.0f, 255.0f, 255.0f);

        glBegin(GL_LINE_LOOP);
        glVertex3f(0.0f, 0.0f, 0.0f);
        glVertex3f(Configuration.CHUNK_DIMENSIONS.x, 0.0f, 0.0f);
        glVertex3f(Configuration.CHUNK_DIMENSIONS.x, Configuration.CHUNK_DIMENSIONS.y, 0.0f);
        glVertex3f(0.0f, Configuration.CHUNK_DIMENSIONS.y, 0.0f);
        glEnd();

        glBegin(GL_LINE_LOOP);
        glVertex3f(0.0f, 0.0f, 0.0f);
        glVertex3f(0.0f, 0.0f, Configuration.CHUNK_DIMENSIONS.z);
        glVertex3f(0.0f, Configuration.CHUNK_DIMENSIONS.y, Configuration.CHUNK_DIMENSIONS.z);
        glVertex3f(0.0f, Configuration.CHUNK_DIMENSIONS.y, 0.0f);
        glVertex3f(0.0f, 0.0f, 0.0f);
        glEnd();

        glBegin(GL_LINE_LOOP);
        glVertex3f(0.0f, 0.0f, Configuration.CHUNK_DIMENSIONS.z);
        glVertex3f(Configuration.CHUNK_DIMENSIONS.x, 0.0f, Configuration.CHUNK_DIMENSIONS.z);
        glVertex3f(Configuration.CHUNK_DIMENSIONS.x, Configuration.CHUNK_DIMENSIONS.y, Configuration.CHUNK_DIMENSIONS.z);
        glVertex3f(0.0f, Configuration.CHUNK_DIMENSIONS.y, Configuration.CHUNK_DIMENSIONS.z);
        glVertex3f(0.0f, 0.0f, Configuration.CHUNK_DIMENSIONS.z);
        glEnd();

        glBegin(GL_LINE_LOOP);
        glVertex3f(Configuration.CHUNK_DIMENSIONS.x, 0.0f, 0.0f);
        glVertex3f(Configuration.CHUNK_DIMENSIONS.x, 0.0f, Configuration.CHUNK_DIMENSIONS.z);
        glVertex3f(Configuration.CHUNK_DIMENSIONS.x, Configuration.CHUNK_DIMENSIONS.y, Configuration.CHUNK_DIMENSIONS.z);
        glVertex3f(Configuration.CHUNK_DIMENSIONS.x, Configuration.CHUNK_DIMENSIONS.y, 0.0f);
        glVertex3f(Configuration.CHUNK_DIMENSIONS.x, 0.0f, 0.0f);
        glEnd();
    }
}
