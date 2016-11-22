package com.beloo.widget.chipslayoutmanager.layouter.breaker;

public class LTRRowBreakerFactory implements IBreakerFactory {
    @Override
    public ILayoutRowBreaker createBackwardRowBreaker() {
        return new LTRUpRowBreaker();
    }

    @Override
    public ILayoutRowBreaker createForwardRowBreaker() {
        return new LTRDownRowBreaker();
    }
}