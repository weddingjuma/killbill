/*
 * Copyright 2010-2011 Ning, Inc.
 * Copyright 2014 Groupon, Inc
 * Copyright 2014 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.mock.glue;

import org.killbill.billing.payment.api.PaymentApi;
import org.killbill.billing.payment.api.PaymentInternalApi;
import org.killbill.billing.platform.api.KillbillConfigSource;
import org.killbill.billing.util.glue.KillBillModule;
import org.mockito.Mockito;

public class MockPaymentModule extends KillBillModule {

    public MockPaymentModule(final KillbillConfigSource configSource) {
        super(configSource);
    }

    @Override
    protected void configure() {
        bind(PaymentApi.class).toInstance(Mockito.mock(PaymentApi.class));
        bind(PaymentInternalApi.class).toInstance(Mockito.mock(PaymentInternalApi.class));
    }
}