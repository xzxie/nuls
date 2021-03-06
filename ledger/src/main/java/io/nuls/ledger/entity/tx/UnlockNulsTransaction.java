/**
 * MIT License
 *
 * Copyright (c) 2017-2018 nuls.io
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.nuls.ledger.entity.tx;

import io.nuls.core.exception.NulsException;
import io.nuls.ledger.entity.params.CoinTransferData;
import io.nuls.protocol.constant.TransactionConstant;
import io.nuls.protocol.model.BaseNulsData;

/**
 * @author Niels
 * @date 2017/11/20
 */
public class UnlockNulsTransaction<T extends BaseNulsData> extends AbstractCoinTransaction<T> {
    public UnlockNulsTransaction() {
        this(TransactionConstant.TX_TYPE_UNLOCK);
    }

    public UnlockNulsTransaction(CoinTransferData params, String password) throws NulsException {
        this(TransactionConstant.TX_TYPE_UNLOCK, params, password);

    }

    protected UnlockNulsTransaction(int type, CoinTransferData params, String password) throws NulsException {
        super(type, params, password);
    }

    protected UnlockNulsTransaction(int type) {
        super(type);
    }
}
