package com.izeye.helloworld.firebaseadmin;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

/**
 * {@link ConfigurationProperties} for Firebase.
 *
 * @author Johnny Lim
 */
@ConfigurationProperties(prefix = "gcp.firebase")
public class FirebaseProperties {

    private Resource serviceAccount;

    public Resource getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(Resource serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

}
