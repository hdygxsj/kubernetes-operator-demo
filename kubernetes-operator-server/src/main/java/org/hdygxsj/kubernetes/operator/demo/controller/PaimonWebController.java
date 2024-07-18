package org.hdygxsj.kubernetes.operator.demo.controller;

import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import org.hdygxsj.kubernetes.operator.api.PaimonWebDeployment;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;

public class PaimonWebController implements Reconciler<PaimonWebDeployment>{
    @Override
    public UpdateControl<PaimonWebDeployment> reconcile(PaimonWebDeployment paimonWebDeployment, Context<PaimonWebDeployment> context) throws Exception {
        return null;
    }
}
