package org.hdygxsj.kubernetes.operator.api;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;

public class PaimonWebDeployment<SPEC,STATUS> extends CustomResource<SPEC,STATUS> implements Namespaced{
}
