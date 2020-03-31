
module org.praxislive.processing.lwjgl {
    
    requires java.desktop;
    
    requires org.praxislive.processing.core;
    requires org.lwjgl;
    requires org.lwjgl.glfw;
    requires org.lwjgl.opengl;
    requires org.lwjgl.stb;
    
    exports processing.lwjgl;
    
}
