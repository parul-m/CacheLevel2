
import dto.product;
import myconfig.connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class test {
    public static void main(String[] args) {
        SessionFactory sf = connection.getSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        /*product p=new product(101,"Mobile",2999);
        s.save(p);*/
        product p2 = (product) s.get(product.class, 101);
        System.out.println(p2);
  
        t.commit();
        s.close();
        Session s2=sf.openSession();
        
        product p3 = (product) s2.get(product.class, 101);
        System.out.println(p3);
}
}
