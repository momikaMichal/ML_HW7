package HomeWork7;


import weka.core.Instance;
import weka.core.Instances;

public class KMeans {

    /**
     * Builds the KMeans object.
     * Initializes centroids and runs the K-Means algorithm.
     *
     * @param data
     */
    // TODO: Implement
    public void buildClusterModel(Instances data) {

    }

    /**
     * Initializes the centroids by selecting k random instances from the
     * training set and setting the centroids to be those instances.
     *
     * @param data
     */
    // TODO : Implement
    private void initializeCentroids(Instances data) {

    }

    /**
     * Finds and stores the centroids according to the KMeans algorithm.
     *
     * @param data
     */
    // TODO: Implement
    private void findKMeansCentroids(Instances data) {

    }

    /**
     * Calculated the squared distance from a given centroid.
     *
     * @param instance the instance from the data set
     * @param centroid the centroid
     * @return the squared distance between the input instance and the input centroid
     */
    // TODO: Implement
    private double calcSquaredDistanceFromCentroid(Instance instance, Instance centroid) {
        return 0.0;
    }

    /**
     * Finds the closest centroid to the input instance
     *
     * @param instance
     * @return the index of the closest centroid to the input instance
     */
    private int findClosestCentroid(Instance instance) {
        return 0;
    }

    /**
     * Replaces every instance in Instances object by the centroid to which it is assigned.
     * (closest centroid) and return the new Instances object.
     *
     * @param data
     * @return the new Instances object
     */
    // TODO: Implement
    private Instances quantize(Instances data) {
        return null;
    }

    /**
     * Calculated the average WSSSE of a given Instances object.
     * It calculates the average squared distance of every instance
     * from the centroid to which it is assigned
     *
     * @param data
     * @return the average within set sum of squared errors
     */
    // TODO: Implement
    private double calcAvgWSSSE(Instances data) {
        return 0.0;
    }
}
