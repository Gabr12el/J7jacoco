package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;//вот не используется он(
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;//некачественный код, но менять нельзя
        return current_max;
    }
}
