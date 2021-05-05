package com.java8;

import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;

public class SSLConnectionSteps {

	public static void main(String[] args) {
			String CERT_ALIAS = "myalias", CERT_PASSWORD = "mypassword";

//			KeyStore identityKeyStore = KeyStore.getInstance("jks");
//
//			FileInputStream identityKeyStoreFile = new FileInputStream(new File("identity.jks"));
//
//			identityKeyStore.load(identityKeyStoreFile, CERT_PASSWORD.toCharArray());
//
//			KeyStore trustKeyStore = KeyStore.getInstance("jks");
//
//			FileInputStream trustKeyStoreFile = new FileInputStream(new File("truststore.jks"));
//
//			trustKeyStore.load(trustKeyStoreFile, CERT_PASSWORD.toCharArray());

//			SSLContext sslContext = SSLContexts.custom()
//
//											   // load identity keystore
//
//											   .loadKeyMaterial(identityKeyStore, CERT_PASSWORD.toCharArray(),
//												   new PrivateKeyStrategy() {
//
//													   @Override
//
//													   public String chooseAlias(Map<String, PrivateKeyDetails> aliases,
//																				 Socket socket) {
//
//														   return CERT_ALIAS;
//
//													   }
//
//												   })
//
//											   // load trust keystore
//
//											   .loadTrustMaterial(trustKeyStore, null)
//
//											   .build();
//
//			SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext,
//
//				new String[]{"TLSv1.2", "TLSv1.1"},
//
//				null,
//
//				SSLConnectionSocketFactory.getDefaultHostnameVerifier());
		}
	}
