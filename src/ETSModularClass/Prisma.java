package ETSModularClass;

public class Prisma {

    private int baseTriangulo; 
    private int alturaPrisma; 

    /**

     * Constructor por defecto para crear el objeto en la dirección de memoria.
     */
    Prisma() {
    }

    /**
     * Constructor que recibe el valor de la base del triángulo y la altura del
     * prisma.
     * 
     * @param baseTriangulo Base del triángulo equilátero.
     * @param alturaPrisma  La altura del prisma.
     */
    Prisma(int baseTriangulo, int alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }

    /**
     * Setter para cambiar la medida de la base del triángulo equilátero del prisma.
     * 
     * @param newBaseTriangulo La nueva medida para el lado de la base del
     *                         triángulo.
     */
    public void setBaseTriangulo(int newBaseTriangulo) {
        this.baseTriangulo = newBaseTriangulo;
    }

    /**
     * Getter para obtener la base del triángulo equilátero
     * del prisma.
     * 
     * @return La medida del lado de la base del triángulo.
     */
    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    /**
     * Setter para cambiar la medida de la altura del prisma.
     * 
     * @param newAlturaPrisma La nueva medida de la altura del prisma.
     */
    public void setAlturaPrisma(int newAlturaPrisma) {
        this.alturaPrisma = newAlturaPrisma;
    }

    /**
     * Getter para obtener la altura del prisma.
     * 
     * @return La altura del prisma.
     */
    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    /**
     * Método que calcula la altura del triángulo equilátero que forma la base del
     * prisma.
     * 
     * @return La altura del triángulo equilátero.
     */
    public float alturaTriangulo() {
        float hTriang = (float) (baseTriangulo * (Math.sqrt(3) / 2));
        return hTriang;
    }

    /**
     * Método que calcula el área de la base del prisma.
     * 
     * @return El área de la base del prisma.
     */
    public float areaBase() {
        float areaBaseRes = (this.alturaTriangulo() * baseTriangulo) / 2;
        return areaBaseRes;
    }

    /**
     * Método que calcula el perímetro de la base del prisma.
     * 
     * @return El perímetro de la base del prisma.
     */
    public float perimetro() {
        float perim = 3 * baseTriangulo;
        return perim;
    }

    /**
     * Método que calcula el área lateral del prisma.
     * 
     * @return El área lateral del prisma.
     */
    public float areaLateral() {
        float areaLatRes = alturaPrisma * this.perimetro();
        return areaLatRes;
    }

    public float areaTotal() {
        float areaTotalRes = this.areaBase() * 2 + this.areaLateral();
        return areaTotalRes;
    }

}
