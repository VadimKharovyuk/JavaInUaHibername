package com.example.javainuahibername;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Service {
    private final SessionFactory sessionFactory ;

  public Service(){
      sessionFactory = new Configuration().configure()
              .addAnnotatedClass(CustomEntity.class)
              .buildSessionFactory();
  }
  public void save(){
      Session session = sessionFactory.getCurrentSession();
      session.beginTransaction();

      CustomType customType = new CustomType();
      customType.setNumValue(1);
      customType.setVarValue("hello");



      CustomEntity customEntity = new CustomEntity();
      customEntity.setName("Vadim");
      customEntity.setCustomType(customType);
      session.persist(customEntity);

      customType = new CustomType();
      customType.setNumValue(2);
      customType.setVarValue("word");

      customEntity = new CustomEntity();
      customEntity.setName("manager");
      customEntity.setCustomType(customType);
      session.persist(customEntity);

      session.getTransaction().commit();
      session.close();


  }
  public void select(){
      Session session = sessionFactory.getCurrentSession();
      session.beginTransaction();
      List<CustomEntity> customEntities = session.createQuery("FROM CustomEntity", CustomEntity.class).getResultList();

      session.getTransaction().commit();
      session.close();
  }
}
