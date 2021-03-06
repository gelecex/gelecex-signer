package com.gelecex.smartcard.utils;

import com.gelecex.smartcard.exception.GelecexSignerException;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import tr.gov.tubitak.uekae.esya.api.common.util.LicenseUtil;

/**
 * Created by obetron on 17.11.2018
 */
public class ConfigurationUploaderTest {

    private static final Logger LOGGER = Logger.getLogger(ConfigurationUploaderTest.class);

    @Test
    public void licenseFileUploader() {
        try {
            ConfigurationUploader.licenseFileUploader();
            Assert.assertNotNull(LicenseUtil.getLicense());
        } catch (GelecexSignerException e) {
            LOGGER.error(e.getLocalizedMessage(), e);
        }
    }

}