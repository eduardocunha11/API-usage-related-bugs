package org.libreplan.business.reports.dtos;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.apache.commons.lang.StringUtils;
import org.libreplan.business.trees.ITreeNode;

public class Util {
    public static BigDecimal getFractionalPart(BigDecimal value) {
        if (value == null) {
            return value;
        }
        BigDecimal fractionalPart = value
		       .subtract(value.setScale(0, RoundingMode.FLOOR));
        return (fractionalPart.compareTo(BigDecimal.ZERO) != 0) ? 
		fractionalPart : null;
    }
}

