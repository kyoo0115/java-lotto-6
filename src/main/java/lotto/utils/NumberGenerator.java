package lotto.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberGenerator {
    private static final int END_INDEX = 6;
    private static final int FROM_INDEX = 0;

    public static List<LottoNumber> generateByRandom() {
        final List<LottoNumber> lottoNumbers = new ArrayList<>(LottoNumber.getLottoNumberCache().values());
        Collections.shuffle(lottoNumbers);
        return lottoNumbers.subList(FROM_INDEX, END_INDEX);
    }

    public static List<LottoNumber> generate(final List<Integer> lottoNums) {
        return lottoNums.stream()
                .map(LottoNumber::getInstance)
                .sorted()
                .collect(Collectors.toList());
    }
}
