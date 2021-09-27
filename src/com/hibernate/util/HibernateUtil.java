
public class HibernateUtil {
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            try {
                registr = new StandardServiceRegistryBuilder().configure().build();
                MetadataSources sources;
                Metadata metadata = sources.getMetadataBuilder().build();
                sessionFactory = metadata.getSessionFactoryBuilder().build();
            } catch (Exception e) {
                e.printStackTrace();
                if(registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    public static void shutdown() {
        if(resgistry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
