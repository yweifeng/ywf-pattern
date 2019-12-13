package com.ywf.pattern.factory.simplefactory;

/**
 * @Author:ywf
 */
public class ReflectShapeFactory {

    public static IShape getShape(Class clazz) {
        try {
             return (IShape) Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
