package annotation;
public class ClassePrincipal {
        public static void main(String[]args)
        {
            try{
                Class<?> classe = Tabela.class;
                Object AnnotationTabela = classe.getDeclaredConstructor().newInstance();
                AnnotationTabela.getClass().getAnnotations();
                for(Object item : AnnotationTabela.getClass().getDeclaredMethod("teste").getAnnotations())
                {
                    System.out.println(item);
                }
            }
            catch(Exception e)
            {
            System.out.println("Deu certo nao\n"+e);
            }
        }
}