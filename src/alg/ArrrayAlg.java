package alg;

public class ArrrayAlg {
    /**
     * array 常见基本算法构建
     */
    double []a = new double[10];
    int length = a.length;

    public void arrayPort(){
        /**
         * 求数组的最大值
         */
        double max = a[0];
        for(int i = 1; i < length ;i++){
            if (a[i] > max) max = a[i];
        }

        /**
         * 求数组元素的平均值
         */
        double sum= 0;
        for (int i = 0;i < length;i++){
            sum += a[i];
        }
        double average = sum /length;

        /**
         * 复制数组
         */
        double [] b = new double[length];
        for(int i= 0;i < length;i++){
            b[i] = a[i];
        }

        /**
         * 颠倒数组元素的顺序
         */
        for(int i = 0; i< length;i++){
            double temp = a[i];
            a[i] = a[length -i -1];
            a[length -i -1]= temp;
        }
        /**
         * 矩阵相乘
         */
        double [][] c = new double[length][length];
        for(int i = 0;i<length;i++){
            for(int j = 0;j< length;j++){
                for(int k =0 ;k< length;k++){
//                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
    }

}
