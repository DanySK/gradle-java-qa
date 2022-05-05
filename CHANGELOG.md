## [0.24.0](https://github.com/DanySK/gradle-java-qa/compare/0.23.0...0.24.0) (2022-05-05)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.15 ([9e2559b](https://github.com/DanySK/gradle-java-qa/commit/9e2559b9c2371749e50305562a3e26b24e18b213))


### Dependency updates

* **api-deps:** update dependency com.github.spotbugs:spotbugs to v4.7.0 ([06af8cc](https://github.com/DanySK/gradle-java-qa/commit/06af8cc4abd1c5fc2620c814265d85d19e695348))
* **deps:** update io.kotest to v5.3.0 ([16b1a84](https://github.com/DanySK/gradle-java-qa/commit/16b1a84ecd9fdd00cf8462a96ffa4c1594ed67f4))
* **deps:** update plugin kotlin-qa to v0.17.0 ([d8ec30e](https://github.com/DanySK/gradle-java-qa/commit/d8ec30e835e68c87d29d6cc191d43649fd6c6848))
* **deps:** update plugin kotlin-qa to v0.18.0 ([e32e8e8](https://github.com/DanySK/gradle-java-qa/commit/e32e8e8a96f6f4197bbc648387c5b877f5e7cf21))

## [0.23.0](https://github.com/DanySK/gradle-java-qa/compare/0.22.0...0.23.0) (2022-04-30)


### Style improvements

* add trailing commas ([4669b3f](https://github.com/DanySK/gradle-java-qa/commit/4669b3fdd9f10b668ff81110f0d63467336b824e))
* suppress ConstructorParameterNaming over data class meant to interoperate with YAML ([43c8047](https://github.com/DanySK/gradle-java-qa/commit/43c80473733f9930fdac6aa837ba0b13d720aae8))


### Build and continuous integration

* '-Xopt-in' is deprecated, use -opt-in instead ([90f1b80](https://github.com/DanySK/gradle-java-qa/commit/90f1b80ea860799250e457c259495b59f7c79b0e))
* **deps:** update actions/checkout action to v3.0.1 ([d885675](https://github.com/DanySK/gradle-java-qa/commit/d885675d2bb758efde3c1f19fa59ba63a0289762))
* **deps:** update actions/checkout action to v3.0.2 ([b12fcb6](https://github.com/DanySK/gradle-java-qa/commit/b12fcb6de454a7a340e4afacfe35ef07b7403bee))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.10 ([c0a07a7](https://github.com/DanySK/gradle-java-qa/commit/c0a07a7e2bd1ad1b98c65271acfcf7e3747af4b9))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.11 ([44dea7b](https://github.com/DanySK/gradle-java-qa/commit/44dea7bc996cce096dbfc7fe1ae5cfd92429f03e))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.12 ([adad88c](https://github.com/DanySK/gradle-java-qa/commit/adad88ce96db48795183f6d67393a9b45cef6e64))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.13 ([088e79b](https://github.com/DanySK/gradle-java-qa/commit/088e79bd4af4e0efd43ae6d40aa1e450eb8d85be))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.14 ([e2df388](https://github.com/DanySK/gradle-java-qa/commit/e2df38847ead71c3020a12e0fc15d05ce91efe7a))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.8 ([52385e9](https://github.com/DanySK/gradle-java-qa/commit/52385e90b27b28aead4711ccafc43736da078d52))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.9 ([ae40e91](https://github.com/DanySK/gradle-java-qa/commit/ae40e91dcea615f20c52ef586db20631a5ac85bd))
* split the versions of Kotlin and Dokka ([7032296](https://github.com/DanySK/gradle-java-qa/commit/7032296d4492348223380b1ea79df2f1725d4df8))


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-java to v6.45.0 ([8d6d0ff](https://github.com/DanySK/gradle-java-qa/commit/8d6d0ffce6c41d08dbc98d7f18f13f5c60ba7aea))
* **deps:** update dependency gradle to v7.4.2 ([1093e8d](https://github.com/DanySK/gradle-java-qa/commit/1093e8d5dd8370a308b660204db63c1d3ea985cb))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.144 ([f115756](https://github.com/DanySK/gradle-java-qa/commit/f1157561296ef3c8861fe2bdebb0c782023a893b))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.145 ([ca826a6](https://github.com/DanySK/gradle-java-qa/commit/ca826a6972b4753ae815ac0b9c55f9d8697cb548))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.146 ([820b1db](https://github.com/DanySK/gradle-java-qa/commit/820b1db699c616a8e4b91c30a99a6a88d39273ca))
* **deps:** update dependency org.jacoco:org.jacoco.core to v0.8.8 ([4ccdaa4](https://github.com/DanySK/gradle-java-qa/commit/4ccdaa46a2d9c0fd4a93f23571c36be18a5216c6))
* **deps:** update dependency org.mockito:mockito-core to v4.5.0 ([e1ca5a3](https://github.com/DanySK/gradle-java-qa/commit/e1ca5a367254898457d5f623d6c9d6da0db60942))
* **deps:** update dependency org.mockito:mockito-core to v4.5.1 ([05fabc3](https://github.com/DanySK/gradle-java-qa/commit/05fabc3efb8f9d8ac1796a1f1668b340ce07ea18))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.6 ([3cee391](https://github.com/DanySK/gradle-java-qa/commit/3cee39128f9356b0017ea2d1cd331ba9804f9b44))
* **deps:** update io.kotest to v5.2.3 ([49df2f3](https://github.com/DanySK/gradle-java-qa/commit/49df2f345b17bc5d2ba00910e43c6bf972abdc68))
* **deps:** update node.js to 16.15 ([ae810d7](https://github.com/DanySK/gradle-java-qa/commit/ae810d71530660452a0243b9407d088682c3a588))
* **deps:** update plugin com.gradle.enterprise to v3.10 ([c8b62c6](https://github.com/DanySK/gradle-java-qa/commit/c8b62c62d334ff2049a3d21110f50d599d03cc66))
* **deps:** update plugin dokka to v1.6.20 ([029b77a](https://github.com/DanySK/gradle-java-qa/commit/029b77a3d8fe44d0c153a9ec5073ce586f251114))
* **deps:** update plugin dokka to v1.6.21 ([07a61b0](https://github.com/DanySK/gradle-java-qa/commit/07a61b07c97955242650e2d813daa07fe9fc6978))
* **deps:** update plugin gradlepluginpublish to v0.21.0 ([32658e1](https://github.com/DanySK/gradle-java-qa/commit/32658e1e383f43f9cd0e05cffa64306babdc7317))
* **deps:** update plugin kotlin-jvm to v1.6.20 ([8e11a33](https://github.com/DanySK/gradle-java-qa/commit/8e11a331f6c766c7c5eae6965846e8d111f1e084))
* **deps:** update plugin kotlin-jvm to v1.6.21 ([ac00a7a](https://github.com/DanySK/gradle-java-qa/commit/ac00a7a21cf2026342b88bd5380cb59044b94a28))
* **deps:** update plugin kotlin-qa to v0.14.0 ([9989579](https://github.com/DanySK/gradle-java-qa/commit/99895793f70270e4b0c1d6c85dad5145ab8c9161))
* **deps:** update plugin kotlin-qa to v0.14.1 ([7f5dd1e](https://github.com/DanySK/gradle-java-qa/commit/7f5dd1e3cdd4fa6f7be6147c69c2034f3d78fa28))
* **deps:** update plugin kotlin-qa to v0.14.2 ([6f369e2](https://github.com/DanySK/gradle-java-qa/commit/6f369e2997e8b6a11a28e4c493a8083f2caab2f8))
* **deps:** update plugin kotlin-qa to v0.15.0 ([9c16c92](https://github.com/DanySK/gradle-java-qa/commit/9c16c92c4a64baae87ab21dacf5053993bbcf058))
* **deps:** update plugin kotlin-qa to v0.15.1 ([8d7f606](https://github.com/DanySK/gradle-java-qa/commit/8d7f606006e1e6e1f2ebc859d65af14934f73d96))
* **deps:** update plugin kotlin-qa to v0.16.0 ([ba329f2](https://github.com/DanySK/gradle-java-qa/commit/ba329f28246687c07f21aa22bcf2cc6dea96f24a))
* **deps:** update plugin kotlin-qa to v0.16.1 ([a262e50](https://github.com/DanySK/gradle-java-qa/commit/a262e50b58818b6076b1f2ecda0c176344f61c77))
* **deps:** update plugin kotlin-qa to v0.16.2 ([bd18b77](https://github.com/DanySK/gradle-java-qa/commit/bd18b777f4c364ec8d9012aa08880e5a5ec2d10f))
* **deps:** update plugin multijvmtesting to v0.3.5 ([8c50602](https://github.com/DanySK/gradle-java-qa/commit/8c50602b408b68e291150c4569006aa5faef6627))
* **deps:** update plugin multijvmtesting to v0.3.6 ([a7c9198](https://github.com/DanySK/gradle-java-qa/commit/a7c9198d4268e7d4423c81606ba183237c183f33))
* **deps:** update plugin multijvmtesting to v0.3.7 ([a035269](https://github.com/DanySK/gradle-java-qa/commit/a0352698a90bd5690da68699d10105867b699083))
* **deps:** update plugin publishoncentral to v0.7.15 ([a097587](https://github.com/DanySK/gradle-java-qa/commit/a097587499b98001ff483772adc19d26085b234a))
* **deps:** update plugin publishoncentral to v0.7.16 ([fee90df](https://github.com/DanySK/gradle-java-qa/commit/fee90df43c57ebf8fb9141adcf3b2a97e8238a2e))
* **deps:** update plugin publishoncentral to v0.7.17 ([3ecbee2](https://github.com/DanySK/gradle-java-qa/commit/3ecbee210730a632cad066b2021e702e7f3e4cb2))
* **deps:** update plugin publishoncentral to v0.7.18 ([ee37fb9](https://github.com/DanySK/gradle-java-qa/commit/ee37fb97eabe53df5cce8ef2080c50f1829e2c43))
* **deps:** update plugin publishoncentral to v0.7.19 ([ca1f928](https://github.com/DanySK/gradle-java-qa/commit/ca1f928f44539cf13bcd8a3b684aa66de979f3ff))

## [0.22.0](https://github.com/DanySK/gradle-java-qa/compare/0.21.0...0.22.0) (2022-03-28)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.7 ([1e4247f](https://github.com/DanySK/gradle-java-qa/commit/1e4247f0b3aa2cbc570f853b65ac13cb541b84a9))


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-java to v6.44.0 ([04f401b](https://github.com/DanySK/gradle-java-qa/commit/04f401b864c50643c29ac8d1186a1a50eb24fa44))
* **deps:** update dependency gradle to v7.4.1 ([1d57fcd](https://github.com/DanySK/gradle-java-qa/commit/1d57fcd6895d1abb6e85a7f0c2e66988382acb46))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.143 ([5cbd521](https://github.com/DanySK/gradle-java-qa/commit/5cbd521bf0c80bcea2d5a3484384fd483ef7387f))
* **deps:** update dependency io.kotest:kotest-runner-junit5-jvm to v5.2.1 ([0593493](https://github.com/DanySK/gradle-java-qa/commit/0593493163472a4b3ff33c46dd870cb5125879ec))
* **deps:** update dependency org.mockito:mockito-core to v4.4.0 ([7c88dfc](https://github.com/DanySK/gradle-java-qa/commit/7c88dfcae6131a0c582e8ab9f7b1c36371c6960e))
* **deps:** update io.kotest ([21a6500](https://github.com/DanySK/gradle-java-qa/commit/21a65009e1a2e1ebb90dd4d97563d5d1cd921307))
* **deps:** update io.kotest to v5.2.2 ([86fd047](https://github.com/DanySK/gradle-java-qa/commit/86fd04792f8aff27a8d9e9622c4a4dbfc24d3650))
* **deps:** update plugin com.gradle.enterprise to v3.9 ([c896b6e](https://github.com/DanySK/gradle-java-qa/commit/c896b6e5fa5fa6e15acf4dd903b48c87285b5c3f))
* **deps:** update plugin kotlin-qa to v0.12.1 ([d81df7e](https://github.com/DanySK/gradle-java-qa/commit/d81df7e629add177f1d1e1da54a49095672bda77))
* **deps:** update plugin kotlin-qa to v0.13.0 ([148f83b](https://github.com/DanySK/gradle-java-qa/commit/148f83b6942c511059883f125152d1f639a35e79))
* **deps:** update plugin publishoncentral to v0.7.14 ([aad4c92](https://github.com/DanySK/gradle-java-qa/commit/aad4c92d3ed1309bd1b70a33939973741e24fd7f))

## [0.21.0](https://github.com/DanySK/gradle-java-qa/compare/0.20.1...0.21.0) (2022-03-08)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.6 ([0086543](https://github.com/DanySK/gradle-java-qa/commit/00865434b79639ee0a0dfce7664a5794c04aeefe))


### Dependency updates

* **api-deps:** update dependency com.github.spotbugs:spotbugs to v4.6.0 ([3492dbe](https://github.com/DanySK/gradle-java-qa/commit/3492dbe3ab9fcfdae086e148cbcda55f776ccef0))
* **deps:** update plugin kotlin-qa to v0.12.0 ([40982f4](https://github.com/DanySK/gradle-java-qa/commit/40982f4c57b3f7966558ed4dd7d10ff196ea12c8))

### [0.20.1](https://github.com/DanySK/gradle-java-qa/compare/0.20.0...0.20.1) (2022-03-05)


### Bug Fixes

* **checkstyle:** escape the colons with \ in SuppressionCommentFilter ([f44efcb](https://github.com/DanySK/gradle-java-qa/commit/f44efcb80d7003b2ae7553c3e2af6fde60d97c3f))


### Dependency updates

* **deps:** update dependency io.github.classgraph:classgraph to v4.8.141 ([8245393](https://github.com/DanySK/gradle-java-qa/commit/82453935ed4b7bd8a7df46acfb11267c499301fd))


### Build and continuous integration

* **deps:** update actions/checkout action to v3 ([f1d468c](https://github.com/DanySK/gradle-java-qa/commit/f1d468c362dce9011da9c2cd794839d7fcda949f))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.4 ([1076be9](https://github.com/DanySK/gradle-java-qa/commit/1076be940d9215cdfdfd934919ddacc03b75a364))

## [0.20.0](https://github.com/DanySK/gradle-java-qa/compare/0.19.0...0.20.0) (2022-02-26)


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-java to v6.43.0 ([c3c1fb1](https://github.com/DanySK/gradle-java-qa/commit/c3c1fb195acbdcb885620d60486314a37206d519))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.140 ([020dca1](https://github.com/DanySK/gradle-java-qa/commit/020dca1750e3330d611742bb1810d7cb9c1d5c96))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.1 ([bf4456e](https://github.com/DanySK/gradle-java-qa/commit/bf4456e10d305da52ede9e963dc387be578f3e87))

## [0.19.0](https://github.com/DanySK/gradle-java-qa/compare/0.18.0...0.19.0) (2022-02-17)


### Dependency updates

* **api-deps:** update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v5.0.6 ([1706ac0](https://github.com/DanySK/gradle-java-qa/commit/1706ac06ee995ca18160ee70d7f40c2eb6be098c))
* **deps:** update dependency gradle to v7.4 ([c721404](https://github.com/DanySK/gradle-java-qa/commit/c721404634bcdc6c62baaae1ba6fff56383099ba))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.139 ([4ee1489](https://github.com/DanySK/gradle-java-qa/commit/4ee1489b2d8f750eca8242f5f0e0b1fb7bbb86a3))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.5 ([e09a90c](https://github.com/DanySK/gradle-java-qa/commit/e09a90c6a9a0e23922c9e37dbf6fb6c4be8ba9ef))
* **deps:** update node.js to 16.14 ([1db9292](https://github.com/DanySK/gradle-java-qa/commit/1db9292b349939b6064ec5166f9311fe0e737995))
* **deps:** update plugin kotlin-qa to v0.10.0 ([b88f743](https://github.com/DanySK/gradle-java-qa/commit/b88f74387c2db830c632179c3d2da6796deea225))
* **deps:** update plugin kotlin-qa to v0.10.1 ([d732b53](https://github.com/DanySK/gradle-java-qa/commit/d732b53ef7d19bbbff1b0407df93f5920564decc))
* **deps:** update plugin publishoncentral to v0.7.13 ([e11014e](https://github.com/DanySK/gradle-java-qa/commit/e11014e1f27fe87682d75fe821014300af9e110c))

## [0.18.0](https://github.com/DanySK/gradle-java-qa/compare/0.17.0...0.18.0) (2022-01-31)


### Dependency updates

* **api-deps:** update dependency com.puppycrawl.tools:checkstyle to v9.3 ([a990a6c](https://github.com/DanySK/gradle-java-qa/commit/a990a6cac745bbd16c06b47be1d142695a6bbca8))

## [0.17.0](https://github.com/DanySK/gradle-java-qa/compare/0.16.0...0.17.0) (2022-01-31)


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-java to v6.42.0 ([7c6347c](https://github.com/DanySK/gradle-java-qa/commit/7c6347cdb2e38e00592a9e0048f89b81da4d37f9))
* **deps:** update dependency org.mockito:mockito-core to v4.3.0 ([dd372c9](https://github.com/DanySK/gradle-java-qa/commit/dd372c98e2733adab3d1b75a3662bcb9f0607e10))
* **deps:** update dependency org.mockito:mockito-core to v4.3.1 ([6893dfe](https://github.com/DanySK/gradle-java-qa/commit/6893dfe4ac81a331c0ba3498af0906efc4abe413))
* **deps:** update io.kotest to v5 ([f7e18c2](https://github.com/DanySK/gradle-java-qa/commit/f7e18c264646f2dd069427391ed937e90bd5a7b5))
* **deps:** update plugin publishoncentral to v0.7.12 ([23aa13b](https://github.com/DanySK/gradle-java-qa/commit/23aa13b53a776b1e3949967d6a3d4de7e3108fa8))


### Revert previous changes

* **deps:** revert update io.kotest to v5, [#46](https://github.com/DanySK/gradle-java-qa/issues/46) ([#114](https://github.com/DanySK/gradle-java-qa/issues/114)) ([1c88a0d](https://github.com/DanySK/gradle-java-qa/commit/1c88a0d1641254bdbb4e3cf8ab0a7ebd00a462b0))


### Build and continuous integration

* checkout the repo with appropriate permissions when releasing ([cb05627](https://github.com/DanySK/gradle-java-qa/commit/cb056270ee49e28e4b845c285b7831ee781bbc77))
* deploy with a higher permission token ([6c2434e](https://github.com/DanySK/gradle-java-qa/commit/6c2434e674ced1848ceb4c8d3c04ccd4daeb335c))
* limit job concurrency ([5f3a45f](https://github.com/DanySK/gradle-java-qa/commit/5f3a45f3557b26ee76dbcbff133e974cbfa551c1))

## [0.16.0](https://github.com/DanySK/gradle-java-qa/compare/0.15.0...0.16.0) (2022-01-21)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.1.3 ([7e47354](https://github.com/DanySK/gradle-java-qa/commit/7e47354717d6035c5d9df83b15c6cabe5a009dd8))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.0 ([0102ab0](https://github.com/DanySK/gradle-java-qa/commit/0102ab0136e750a4480e6bb4f91ed64a4195dd84))


### Dependency updates

* **api-deps:** update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v5.0.5 ([acb74bc](https://github.com/DanySK/gradle-java-qa/commit/acb74bc1d7572a1c9d4b9c16f506ff2794e2aa57))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.4 ([4944004](https://github.com/DanySK/gradle-java-qa/commit/49440041333594b4fbf092c9aa0d01e593311325))
* **deps:** update plugin com.gradle.enterprise to v3.8.1 ([cfc1a74](https://github.com/DanySK/gradle-java-qa/commit/cfc1a74c9edb3d19fa80f889a4285ba4b41b1b31))
* **deps:** update plugin gradlepluginpublish to v0.20.0 ([8b69ae3](https://github.com/DanySK/gradle-java-qa/commit/8b69ae34458a3ee863df1f637927f2056da88acc))
* **deps:** update plugin multijvmtesting to v0.3.4 ([6e99e93](https://github.com/DanySK/gradle-java-qa/commit/6e99e937d4722cfea4ee4978f6acf6617eaf1f65))
* **deps:** update plugin publishoncentral to v0.7.10 ([1a1e6b3](https://github.com/DanySK/gradle-java-qa/commit/1a1e6b3a9d5557e0454e9ff975984375d9037f9e))
* **deps:** update plugin publishoncentral to v0.7.11 ([c8b98b2](https://github.com/DanySK/gradle-java-qa/commit/c8b98b2961d8e332c6df3580d9a81c4f33226f64))

## [0.15.0](https://github.com/DanySK/gradle-java-qa/compare/0.14.0...0.15.0) (2022-01-06)


### Build and continuous integration

* **release:** enable commit-analyzer ([d817d8f](https://github.com/DanySK/gradle-java-qa/commit/d817d8f74645fd8e5a3ed6f86331b10378bac822))
* **release:** inherit the configuration from the shared preset ([#92](https://github.com/DanySK/gradle-java-qa/issues/92)) ([af08ef2](https://github.com/DanySK/gradle-java-qa/commit/af08ef216665fb323c2f7db9762cffce29ed6223))


### Dependency updates

* **api-deps:** update dependency com.github.spotbugs:spotbugs to v4.5.3 ([12c0951](https://github.com/DanySK/gradle-java-qa/commit/12c095175ef670c2345de36d5885906118d44add))
* **api-deps:** update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v5.0.4 ([2c2490d](https://github.com/DanySK/gradle-java-qa/commit/2c2490d10a369eca94482254885260e9914c5de2))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.1 ([b41a562](https://github.com/DanySK/gradle-java-qa/commit/b41a562d48cfbe1fb339c033dc22cc651c762989))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.3 ([96d0228](https://github.com/DanySK/gradle-java-qa/commit/96d02284b5dc03b23f145410f579e0eaa5927700))
* **deps:** update plugin gradlepluginpublish to v0.19.0 ([3c67d7f](https://github.com/DanySK/gradle-java-qa/commit/3c67d7f23a19f512c3ba28e2601332870098d6ab))
* **deps:** update plugin kotlin-qa to v0.8.3 ([c4620cf](https://github.com/DanySK/gradle-java-qa/commit/c4620cfa95a32d9d6c43d01857c1c5be432733a4))
* **deps:** update plugin kotlin-qa to v0.9.0 ([6ac44d7](https://github.com/DanySK/gradle-java-qa/commit/6ac44d7d9dca2fed39ba702b7db4b489d0b16448))
* **deps:** update plugin multijvmtesting to v0.3.3 ([e777b9d](https://github.com/DanySK/gradle-java-qa/commit/e777b9d7e71805135e469b6efe9c396c683ebac4))
* **deps:** update plugin publishoncentral to v0.7.9 ([2c595ca](https://github.com/DanySK/gradle-java-qa/commit/2c595cab28b09872a038822ab29fbb6959e9256f))


### General maintenance

* ignore node_modules ([84a69eb](https://github.com/DanySK/gradle-java-qa/commit/84a69ebce695f02f7fcf6bbd0a343a5457467693))
* **release:** correctly enable semantic commit conventions ([3775c18](https://github.com/DanySK/gradle-java-qa/commit/3775c18486b1d07c1d0f7f7b040e574dcf3f7831))

# [0.14.0](https://github.com/DanySK/gradle-java-qa/compare/0.13.0...0.14.0) (2021-12-27)


### Features

* **deps:** update dependency com.puppycrawl.tools:checkstyle to v9.2.1 ([54a62fd](https://github.com/DanySK/gradle-java-qa/commit/54a62fdea0539c5434f78b55f08158fe8853cad9))

# [0.13.0](https://github.com/DanySK/gradle-java-qa/compare/0.12.0...0.13.0) (2021-12-15)


### Features

* **deps:** update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v5.0.3 ([2c98777](https://github.com/DanySK/gradle-java-qa/commit/2c9877742feba8438513b57ca55c7b8623e32aa3))

# [0.12.0](https://github.com/DanySK/gradle-java-qa/compare/0.11.0...0.12.0) (2021-12-14)


### Features

* **deps:** update dependency com.github.spotbugs:spotbugs to v4.5.2 ([cfdf67f](https://github.com/DanySK/gradle-java-qa/commit/cfdf67f77e41dd949fcdb1002b629b09ddc03ed1))

# [0.11.0](https://github.com/DanySK/gradle-java-qa/compare/0.10.0...0.11.0) (2021-12-10)


### Features

* set javadoc to be aggressive ([8db3fd6](https://github.com/DanySK/gradle-java-qa/commit/8db3fd6658dba232f13138641fb2dd09e42f7be0))

# [0.10.0](https://github.com/DanySK/gradle-java-qa/compare/0.9.0...0.10.0) (2021-12-09)


### Features

* **deps:** update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v5.0.2 ([546eac3](https://github.com/DanySK/gradle-java-qa/commit/546eac3ab321461e22a0dc29410075b7cf576ca5))

# [0.9.0](https://github.com/DanySK/gradle-java-qa/compare/0.8.0...0.9.0) (2021-12-08)


### Features

* **deps:** update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v5.0.1 ([49db4ca](https://github.com/DanySK/gradle-java-qa/commit/49db4cac921a91732f3bb0fc09f22367eb2d6202))

# [0.8.0](https://github.com/DanySK/gradle-java-qa/compare/0.7.0...0.8.0) (2021-12-08)


### Features

* **deps:** update dependency com.github.spotbugs:spotbugs to v4.5.1 ([b599946](https://github.com/DanySK/gradle-java-qa/commit/b59994638ca3720f2023b67ee8b052528276e3c8))

# [0.7.0](https://github.com/DanySK/gradle-java-qa/compare/0.6.0...0.7.0) (2021-12-07)


### Features

* **deps:** update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v5 ([3b5ecbe](https://github.com/DanySK/gradle-java-qa/commit/3b5ecbe0c76e52ae86d588d3f606b0d82499f67d))

# [0.6.0](https://github.com/DanySK/gradle-java-qa/compare/0.5.0...0.6.0) (2021-11-28)


### Features

* **deps:** update dependency com.puppycrawl.tools:checkstyle to v9.2 ([a9a7da2](https://github.com/DanySK/gradle-java-qa/commit/a9a7da25a8bc612f81174c2d2eace012a9d88154))

# [0.5.0](https://github.com/DanySK/gradle-java-qa/compare/0.4.3...0.5.0) (2021-11-27)


### Features

* **deps:** update dependency net.sourceforge.pmd:pmd-java to v6.41.0 ([10ebb9b](https://github.com/DanySK/gradle-java-qa/commit/10ebb9b861285149b5145bd9879a500a6e07514c))

### Changelog

All notable changes to this project will be documented in this file. Dates are displayed in UTC.

Generated by [`auto-changelog`](https://github.com/CookPete/auto-changelog).

#### [Unreleased](https://github.com/DanySK/gradle-java-qa/compare/0.4.3...HEAD)

- chore(deps): update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v4.8.0 [`8e3f514`](https://github.com/DanySK/gradle-java-qa/commit/8e3f514c4fa095fe274575e0737cb5cd93be2ced)
- chore(deps): update dependency io.github.classgraph:classgraph to v4.8.134 [`bf49707`](https://github.com/DanySK/gradle-java-qa/commit/bf4970747390a91d8c3861ded1c55ff7a49fff1c)
- chore(deps): update dependency io.github.classgraph:classgraph to v4.8.135 [`4c15d99`](https://github.com/DanySK/gradle-java-qa/commit/4c15d99ba8762eaf5687775ced25ec932bdf3f73)
- chore(deps): update dependency io.github.classgraph:classgraph to v4.8.136 [`466999b`](https://github.com/DanySK/gradle-java-qa/commit/466999b13839bb6a93e3db823b76dd482cbd6bce)
- chore(deps): update dependency org.mockito:mockito-core to v4.1.0 [`86aa193`](https://github.com/DanySK/gradle-java-qa/commit/86aa193ed64c9bc32befdc52532facabd9464e1b)
- chore(deps): update plugin com.gradle.enterprise to v3.7.2 [`1a5e4fa`](https://github.com/DanySK/gradle-java-qa/commit/1a5e4fafb8302b85db92dec38073644e8be9306c)
- chore(deps): update plugin dokka to v1.6.0 [`04b01b2`](https://github.com/DanySK/gradle-java-qa/commit/04b01b24bbdd294c9493719b261d21b99c58016d)

#### [0.4.3](https://github.com/DanySK/gradle-java-qa/compare/0.4.2...0.4.3)

> 18 November 2021

- chore(deps): update dependency io.github.classgraph:classgraph to v4.8.133 [`7b464ea`](https://github.com/DanySK/gradle-java-qa/commit/7b464eabc80ff850ed20e361197d06c2a18720c7)
- chore(deps): update plugin gradlepluginpublish to v0.18.0 [`9ce8329`](https://github.com/DanySK/gradle-java-qa/commit/9ce8329c839e4791097ae39ce04e15b936643a31)
- Update checkstyle javadoc config [`7682b0e`](https://github.com/DanySK/gradle-java-qa/commit/7682b0ea442ac3b90c4bb8a248105bd4b18cbb27)

#### [0.4.2](https://github.com/DanySK/gradle-java-qa/compare/0.4.1...0.4.2)

> 15 November 2021

- chore(deps): update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v4.7.10 [`37200ab`](https://github.com/DanySK/gradle-java-qa/commit/37200ab743c2ee33946b0e8b9876bdc217aad8e0)
- chore(deps): update dependency io.github.classgraph:classgraph to v4.8.132 [`891821b`](https://github.com/DanySK/gradle-java-qa/commit/891821bad6d08c84dad7ee1e8443c96d5c57f8c1)

#### [0.4.1](https://github.com/DanySK/gradle-java-qa/compare/0.4.0...0.4.1)

> 11 November 2021

- **Breaking change:** feat!: add auto-changelog configuration [`6b095d0`](https://github.com/DanySK/gradle-java-qa/commit/6b095d021b1aca9ce0cb842b92830fdc726c4897)
- chore(deps): update dependency com.github.spotbugs:spotbugs to v4.5.0 [`2a3e793`](https://github.com/DanySK/gradle-java-qa/commit/2a3e793b936f9dfa72bb42cb35bb0b7d6ec4a63c)
- chore(deps): update dependency gradle to v7.3 [`7abb995`](https://github.com/DanySK/gradle-java-qa/commit/7abb995bce1bd1e0763d56a89e78f96943474ddf)
- chore(deps): update dependency io.github.classgraph:classgraph to v4.8.130 [`278ae97`](https://github.com/DanySK/gradle-java-qa/commit/278ae97e207f2ef0a7e3c7f21c3755a1888c4d6e)
- chore(deps): update dependency io.github.classgraph:classgraph to v4.8.131 [`94f5118`](https://github.com/DanySK/gradle-java-qa/commit/94f5118295912c4b0906aed1384318ab9f666dc4)
- chore(deps): update plugin multijvmtesting to v0.2.0 [`2aae729`](https://github.com/DanySK/gradle-java-qa/commit/2aae7297f28e1a4780be925eacc9b686e071b6a2)
- feat: add auto-changelog configuration [`1bc21af`](https://github.com/DanySK/gradle-java-qa/commit/1bc21afb0ad093f3e57952121febe3768474f421)

#### [0.4.0](https://github.com/DanySK/gradle-java-qa/compare/0.3.0...0.4.0)

> 6 November 2021

- Bundle-ize all deps [`462d34a`](https://github.com/DanySK/gradle-java-qa/commit/462d34a769fad9e429aeeda191d495090ed72794)
- fix: do not fail if there is no source for CPD [`3b96b70`](https://github.com/DanySK/gradle-java-qa/commit/3b96b7095007b5a5b95d7e5c15b5693a0e0a4438)
- fix: escape backslashesh correctly in additional suppressions [`e2dec2f`](https://github.com/DanySK/gradle-java-qa/commit/e2dec2fb70890a0054792fe0f95208d404389b68)
- fix: Generate configuration files on the fly [`cfd4232`](https://github.com/DanySK/gradle-java-qa/commit/cfd4232f25c4ab1b3f95f6c41db37cbb270c5cca)
- fix: generate the configuration files in the root project only [`556bfdc`](https://github.com/DanySK/gradle-java-qa/commit/556bfdcc836551aa9a37851dba1d4fdf4a660554)
- fix: load all classpath resources upfront [`d35056e`](https://github.com/DanySK/gradle-java-qa/commit/d35056e15b23e16b0321195187e9b5986e87cdca)
- fix: process the checkstyle configuration files after configuration [`5789385`](https://github.com/DanySK/gradle-java-qa/commit/57893851f1edb3be3f22b36aad50e4a994b49f9a)
- fix: use the proper extension for the SpotBugs exclusions file [`3dc06a7`](https://github.com/DanySK/gradle-java-qa/commit/3dc06a7f124849c359311af0f89d7be6c1195cbe)
- Inherit CPD settings from kotlin-qa [`a455664`](https://github.com/DanySK/gradle-java-qa/commit/a455664a5de863d13bfda42d18423c249875a7df)
- refactor: compute versions upfront [`d06a105`](https://github.com/DanySK/gradle-java-qa/commit/d06a105d0c30f57721e9314f067e0d61fcf97988)
- refactor: create the spotbugs exclusions upfront [`646fb8e`](https://github.com/DanySK/gradle-java-qa/commit/646fb8eb04be0deb6db9e194e3c05ad8452ab19a)
- Regenerate changelog [`2f90f6f`](https://github.com/DanySK/gradle-java-qa/commit/2f90f6ff7f6e06b4565c551a34a7605e97fe3ee5)
- test: add a test with a hierarchic project [`b7bf936`](https://github.com/DanySK/gradle-java-qa/commit/b7bf93602c4cc8fe361b236e228ac62e0b6ad6f5)
- Update plugin gradlePluginPublish to v0.17.0 [`8a4ee00`](https://github.com/DanySK/gradle-java-qa/commit/8a4ee009a4ac28cf8d856dfd733f4b9204dab994)
- Update plugin kotlin-qa to v0.3.2 [`faaabed`](https://github.com/DanySK/gradle-java-qa/commit/faaabed7e51dc68df91539cb877f04bedf58f537)

#### [0.3.0](https://github.com/DanySK/gradle-java-qa/compare/0.2.3...0.3.0)

> 3 November 2021

- Add support for CPD [`69d87ba`](https://github.com/DanySK/gradle-java-qa/commit/69d87bad87fe1f773b99bb39c352a533b1411b2f)
- Do not use * imports [`1eef966`](https://github.com/DanySK/gradle-java-qa/commit/1eef9664cb69a1e1dc3524081e29d54edc4c9556)
- Enable CPD [`a322d1a`](https://github.com/DanySK/gradle-java-qa/commit/a322d1a6407495fb0485f0035eda9125ae253f3a)
- Optimize imports [`ef58c90`](https://github.com/DanySK/gradle-java-qa/commit/ef58c9017ef8519e01ee1e25b8e591fe94c7e445)
- Remove leftover from template project [`6f6e824`](https://github.com/DanySK/gradle-java-qa/commit/6f6e824a2626427067ae9002fafb8ca67ddd997b)
- Remove template leftovers [`4e713b9`](https://github.com/DanySK/gradle-java-qa/commit/4e713b986e96a84353229c588c0d0188d53bbf3a)
- Update CHANGELOG.md [`733a994`](https://github.com/DanySK/gradle-java-qa/commit/733a99437609c5cd738ad899273d9de3f2a0f3c4)
- Update plugin kotlin-qa to v0.2.2 [`a59be96`](https://github.com/DanySK/gradle-java-qa/commit/a59be962acb280e931538015439a74393cf14173)
- Update the README.md [`4476cb3`](https://github.com/DanySK/gradle-java-qa/commit/4476cb3f96e0a20a3cf74e53bda11a6388a9596f)

#### [0.2.3](https://github.com/DanySK/gradle-java-qa/compare/0.2.2...0.2.3)

> 31 October 2021

- [Autodelivery] update Gradle plugins CI from DanySK/centralized-automated-deployer@6b41b2d [`953cdf4`](https://github.com/DanySK/gradle-java-qa/commit/953cdf4c8a204a8ebafa422d1c6a395d3cac6eaa)
- set org.gradle.jvmargs=-XX:MaxMetaspaceSize=512m [`aa76069`](https://github.com/DanySK/gradle-java-qa/commit/aa7606959fbe5e7306bbb146b1c7a8850713277d)
- Update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v4.7.8 [`bf21b65`](https://github.com/DanySK/gradle-java-qa/commit/bf21b6581b3cb3c4f090a95cf615e4f586652cf5)
- Update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v4.7.9 [`3df6cc3`](https://github.com/DanySK/gradle-java-qa/commit/3df6cc351b66ca9ebd03b6c3bcab3199a697dc25)
- Update dependency com.puppycrawl.tools:checkstyle to v9.1 [`e44931a`](https://github.com/DanySK/gradle-java-qa/commit/e44931ae9c8b25e794cc359a8a4c408d12fcd4de)
- Update dependency io.github.classgraph:classgraph to v4.8.127 [`86ed801`](https://github.com/DanySK/gradle-java-qa/commit/86ed801726f4815d9503f526d471a5e6d00eaf87)
- Update dependency io.github.classgraph:classgraph to v4.8.128 [`aa795b3`](https://github.com/DanySK/gradle-java-qa/commit/aa795b3da269d9ae689fa08fa743fbf6ac7c74ce)
- Update dependency io.github.classgraph:classgraph to v4.8.129 [`9d811a1`](https://github.com/DanySK/gradle-java-qa/commit/9d811a16129339364527daa20498a5f2fdece7b9)
- Update dependency net.sourceforge.pmd:pmd-java to v6.40.0 [`6efcab5`](https://github.com/DanySK/gradle-java-qa/commit/6efcab5ba3902cc945dfc3eea1d6e61b0f92cd1e)
- Update plugin com.gradle.enterprise to v3.7.1 [`3f5dad1`](https://github.com/DanySK/gradle-java-qa/commit/3f5dad1a1e02a7fc285d5e7381f67c452497c91a)
- Use a custom checkout action [`5bd9dbe`](https://github.com/DanySK/gradle-java-qa/commit/5bd9dbe9b50d2013110f017c0e01a072c8abe225)
- Use the default Java environment [`389e01f`](https://github.com/DanySK/gradle-java-qa/commit/389e01f845f5bd98a4e6be79b6f64e528b44804f)

#### [0.2.2](https://github.com/DanySK/gradle-java-qa/compare/0.2.1...0.2.2)

> 12 October 2021

- Update CHANGELOG.md [`d246f7f`](https://github.com/DanySK/gradle-java-qa/commit/d246f7f850efcf368af2b3952c5084a7681b06e1)
- Update dependency com.github.spotbugs:spotbugs to v4.4.2 [`a41d68e`](https://github.com/DanySK/gradle-java-qa/commit/a41d68e9ce17d71c24b1887e82dbe50651297392)
- Update dependency com.github.spotbugs.snom:spotbugs-gradle-plugin to v4.7.7 [`22fca6d`](https://github.com/DanySK/gradle-java-qa/commit/22fca6d0ef11b3ec9a721a4213d060f42b22b4e3)
- Update dependency io.github.classgraph:classgraph to v4.8.126 [`c9a3d80`](https://github.com/DanySK/gradle-java-qa/commit/c9a3d80d206b64a27468ada6cf288d04f37c3963)

#### [0.2.1](https://github.com/DanySK/gradle-java-qa/compare/0.2.0...0.2.1)

> 8 October 2021

- Format titles in changelog [`9b51041`](https://github.com/DanySK/gradle-java-qa/commit/9b510416210a28539ea37d294cfcad4dead7302f)
- Update CHANGELOG.md [`3b498eb`](https://github.com/DanySK/gradle-java-qa/commit/3b498eb370c98366e89ca1e7a2ed8390645af27e)
- Update dependency com.puppycrawl.tools:checkstyle to v9 [`ecb6627`](https://github.com/DanySK/gradle-java-qa/commit/ecb662719e237579ddfc98e7b5df977686255402)

#### [0.2.0](https://github.com/DanySK/gradle-java-qa/compare/0.1.0...0.2.0)

> 8 October 2021

- Create .stickler.yml [`c4f2318`](https://github.com/DanySK/gradle-java-qa/commit/c4f23180c823470f241972d04696d338eb2709bf)
- Create a reasonable readme [`ae92d8a`](https://github.com/DanySK/gradle-java-qa/commit/ae92d8a9d454b4b96f8ceb1636e06312e04ee5ea)
- Remove Alchemist-specific checkstyle rules [`f418000`](https://github.com/DanySK/gradle-java-qa/commit/f41800097ea2365f423e2bb238a9a64f409a7f7f)
- Update CHANGELOG.md [`019491e`](https://github.com/DanySK/gradle-java-qa/commit/019491e96e15e3bec8af7b63bf55874ce3b3dd09)
- Update dependency com.puppycrawl.tools:checkstyle to v8.45.1 [`b11d756`](https://github.com/DanySK/gradle-java-qa/commit/b11d756ecd3b492a6cd7247b69be5e474838a896)
- Update dependency org.mockito:mockito-core to v4 [`e759220`](https://github.com/DanySK/gradle-java-qa/commit/e75922042e0b1030597e7cffa43b8f16ecaa3397)
- Update plugin kotlin-qa to v0.2.1 [`616ca02`](https://github.com/DanySK/gradle-java-qa/commit/616ca0292368dbec94bd82819e1a32ed0d99dad5)
- Update property name for JavadocMethod [`0cd584e`](https://github.com/DanySK/gradle-java-qa/commit/0cd584e44e93a15b866d7b7893f525ee6540fcd1)

#### 0.1.0

> 7 October 2021

- Create CHANGELOG.md [`ca0cf6a`](https://github.com/DanySK/gradle-java-qa/commit/ca0cf6acac359f327e42f93c7a55b28251adbbb1)
- Create LICENSE [`58c905f`](https://github.com/DanySK/gradle-java-qa/commit/58c905f5b838186a2ce7534d20dd81b6ffb63496)
- First version passing basic tests [`bbcdab4`](https://github.com/DanySK/gradle-java-qa/commit/bbcdab4d9c0961b66827b80bb828c39a67d719c7)
- Initial commit [`0ed9854`](https://github.com/DanySK/gradle-java-qa/commit/0ed98542d383becba1b7c8f52e50be0601baa0a1)
- Make check pass [`1767a87`](https://github.com/DanySK/gradle-java-qa/commit/1767a87e397aae0852d3ccc8a019cdb1c46b9ec4)
- Rename MissingBreakInSwitch to ImplicitSwitchFallThrough [`f9f3bea`](https://github.com/DanySK/gradle-java-qa/commit/f9f3bea0c43d04a67b9b524ee55468da7fbd0cd7)
- Set the plugin name [`4363696`](https://github.com/DanySK/gradle-java-qa/commit/4363696900e18fef5faecef949a620e7dfa38d70)
- Try to work around issues with Windows [`96c8a39`](https://github.com/DanySK/gradle-java-qa/commit/96c8a394c07018682de79a3eadd97815b040aaaf)
- Update dependency io.github.classgraph:classgraph to v4.8.123 [`344fa92`](https://github.com/DanySK/gradle-java-qa/commit/344fa92f1ef2c562868312e62078c920e4a0f5fa)
- Update dependency io.github.classgraph:classgraph to v4.8.124 [`21f032a`](https://github.com/DanySK/gradle-java-qa/commit/21f032ac002eda32413da4f397961f961c7eab9d)
- Update dependency io.github.classgraph:classgraph to v4.8.125 [`b46390d`](https://github.com/DanySK/gradle-java-qa/commit/b46390df04670cb6bd43938c2a3617c12ba3179f)
- Update plugin com.gradle.enterprise to v3.7 [`283ae9e`](https://github.com/DanySK/gradle-java-qa/commit/283ae9ebe6bd84b86016518ff6d0b396d8821d9a)
- Update plugin kotlin-qa to v0.2.0 [`79fdfa9`](https://github.com/DanySK/gradle-java-qa/commit/79fdfa9084530090ce1012189e5758c06c7bdcf6)
- Update plugin publishOnCentral to v0.6.1 [`8fa5fba`](https://github.com/DanySK/gradle-java-qa/commit/8fa5fba487835d5bf43f99353c78e98a280966ef)
