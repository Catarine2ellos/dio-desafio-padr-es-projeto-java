package desafioPadraodeProjetoJava.gof.singleton;
import desafioPadraodeProjetoJava.gof.facade.Facade;
import desafioPadraodeProjetoJava.gof.singleton.SingletonEager;
import desafioPadraodeProjetoJava.gof.singleton.SingletonLazy;
import desafioPadraodeProjetoJava.gof.singleton.SingletonLazyHolder;
import desafioPadraodeProjetoJava.gof.strategy.*;


public class Teste {

    public static void main(String[] args) {

    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    lazy = SingletonLazy.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazyHolder);

    // strategY

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover ();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();


        /// Facade


        Facade facade = new Facade();
        facade.migrarCliente("venilton","14801788");


    }


}


