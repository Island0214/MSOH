package util.sort;

import vo.OrderVO;

import java.util.Comparator;

/**
 * Created by Pxr on 16/12/7.
 */
public class sortOrderByDate implements Comparator<OrderVO> {

    public int compare(OrderVO o1, OrderVO o2) {
        return o2.estimatedCheckinTime.compareTo(o1.estimatedCheckinTime);
    }
}
