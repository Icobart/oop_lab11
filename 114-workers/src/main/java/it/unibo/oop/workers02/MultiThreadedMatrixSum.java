package it.unibo.oop.workers02;

/**
 * Implementation of a matrix sum.
 * 
 */
public final class MultiThreadedSumMatrix implements SumMatrix {

    private final int nthread;

    /**
     * 
     * @param nthread no. of thread performing the sum.
     */
    public MultiThreadedSumMatrix(final int nthread) {
        this.nthread = nthread;
    }

    private static class Worker extends Thread {

    }

    @Override
    public double sum(double[][] matrix) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

}