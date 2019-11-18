/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author jit
 */
public class LargeObserver extends Observer {
    

    public LargeObserver(Source aSource) {

        this.aSource = aSource;
        this.aSource.addObserver(this);

    }

    @Override
    public void update() {
        System.out.println("Large String: "
        + aSource.getData().toUpperCase());
    }

}
