package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.OperationHandler;

public class ReturnHandler implements OperationHandler {

    @Override
    public int executeOperation(int currentQuantity, int quantityFromTransaction) {
        return currentQuantity + quantityFromTransaction;
    }
}
