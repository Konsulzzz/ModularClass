package ETSModularClass;



import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class mainPrisma {
    public static void main(String[] args) {
        Prisma prism1 = new Prisma(4, 6);
        Prisma prism2 = new Prisma(1, 5);
        Prisma prism3 = new Prisma(10, 12);
        
        List<Float> prismList = Arrays.asList(prism1.areaTotal(), prism2.areaTotal(), prism3.areaTotal());
        Collections.sort(prismList);
        Collections.reverse(prismList);

        System.out.println(prismList.toString());

    }
}
