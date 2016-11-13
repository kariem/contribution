////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code for adherence to a set of rules.
// Copyright (C) 2001-2016 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
////////////////////////////////////////////////////////////////////////////////

package com.github.checkstyle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.google.common.base.Verify;

/**
 * Helper structure class to clear show what command line arguments are required for NotesBuilder
 * to run.
 * @author Andrei Selkin
 */
public final class CliOptions {

    /** Path to a local git repository. */
    private String localRepoPath;
    /** Start reference. */
    private String startRef;
    /** End reference. */
    private String endRef;
    /** Release number. */
    private String releaseNumber;
    /** Auth token. */
    private String authToken;

    /** Output file location. */
    private String outputLocation;
    /** Whether to generate all posts. */
    private boolean generateAll;
    /** Whether to generate a post for xdoc. */
    private boolean generateXdoc;
    /** Whether to generate a post for Twitter. */
    private boolean generateTw;
    /** Whether to generate a post for Google Plus. */
    private boolean generateGplus;
    /** Whether to generate a post for RSS. */
    private boolean generateRss;
    /** Whether to generate a post for Mailing List. */
    private boolean generateMlist;

    /** Whether to publish all social posts. */
    private boolean publishAllSocial;

    /** Whether to publish on Twitter. */
    private boolean publishTwit;
    /** Consumer key for Twitter. */
    private String twitterConsumerKey;
    /** Consumer secret for Twitter. */
    private String twitterConsumerSecret;
    /** Access token for Twitter. */
    private String twitterAccessToken;
    /** Access token secret for Twitter. */
    private String twitterAccessTokenSecret;
    /** Properties for connection to Twitter. */
    private String twitterProperties;

    /** Whether to publish xdoc. */
    private boolean publishXdoc;
    /** Whether to publish xdoc with push. */
    private boolean publishXdocWithPush;

    /** Default constructor. */
    private CliOptions() { }

    public String getLocalRepoPath() {
        return localRepoPath;
    }

    public String getStartRef() {
        return startRef;
    }

    public String getEndRef() {
        return endRef;
    }

    public String getReleaseNumber() {
        return releaseNumber;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getOutputLocation() {
        return outputLocation;
    }

    public boolean isGenerateAll() {
        return generateAll;
    }

    public boolean isGenerateXdoc() {
        return generateXdoc;
    }

    public boolean isGenerateTw() {
        return generateTw;
    }

    public boolean isGenerateGplus() {
        return generateGplus;
    }

    public boolean isGenerateRss() {
        return generateRss;
    }

    public boolean isGenerateMlist() {
        return generateMlist;
    }

    public boolean isPublishAllSocial() {
        return publishAllSocial;
    }

    public boolean isPublishTwit() {
        return publishTwit;
    }

    public String getTwitterConsumerKey() {
        return twitterConsumerKey;
    }

    public String getTwitterConsumerSecret() {
        return twitterConsumerSecret;
    }

    public String getTwitterAccessToken() {
        return twitterAccessToken;
    }

    public String getTwitterAccessTokenSecret() {
        return twitterAccessTokenSecret;
    }

    public boolean isPublishXdoc() {
        return publishXdoc;
    }

    public boolean isPublishXdocWithPush() {
        return publishXdocWithPush;
    }

    /**
     * Creates a new Builder instance.
     * @return new Builder instance.
     */
    public static Builder newBuilder() {
        return new CliOptions().new Builder();
    }

    /**
     * Class which implements Builder pattern for building CliOptions instance.
     */
    public final class Builder {

        /** Default constructor. */
        private Builder() { }

        /**
         * Specify Local repository path.
         * @param path Local repository path
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setLocalRepoPath(String path) {
            localRepoPath = path;
            return this;
        }

        /**
         * Specify Start git reference.
         * @param ref Start reference
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setStartRef(String ref) {
            startRef = ref;
            return this;
        }

        /**
         * Specify End git reference.
         * @param ref End reference
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setEndRef(String ref) {
            endRef = ref;
            return this;
        }

        /**
         * Specify release number.
         * @param number Release Number
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setReleaseNumber(String number) {
            releaseNumber = number;
            return this;
        }

        /**
         * Specify Auth Token.
         * @param token Auth Token
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setAuthToken(String token) {
            authToken = token;
            return this;
        }

        /**
         * Specify Output location.
         * @param outputLoc Output location
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setOutputLocation(String outputLoc) {
            outputLocation = outputLoc;
            return this;
        }

        /**
         * Specify flag to generate all.
         * @param genAll flag to generate all
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setGenerateAll(boolean genAll) {
            generateAll = genAll;
            return this;
        }

        /**
         * Specify flag to generate xdoc.
         * @param genXdoc flag to generate xdoc
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setGenerateXdoc(boolean genXdoc) {
            generateXdoc = genXdoc;
            return this;
        }

        /**
         * Spacify flag to generate twiter post.
         * @param genTw flag to generate twitt
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setGenerateTw(boolean genTw) {
            generateTw = genTw;
            return this;
        }

        /**
         * Spacify flag to generate google plus post.
         * @param genGplus flag to generate google plus
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setGenerateGplus(boolean genGplus) {
            generateGplus = genGplus;
            return this;
        }

        /**
         * Specify flag to generate RSS post.
         * @param genRss flag to generate RSS post
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setGenerateRss(boolean genRss) {
            generateRss = genRss;
            return this;
        }

        /**
         * Spacify flag to generate Mail-list post.
         * @param genMlist flag to generate mail-list post
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setGenerateMlist(boolean genMlist) {
            generateMlist = genMlist;
            return this;
        }

        /**
         * Spacify to do publish all social posts.
         * @param pubAllSocial flag to generate all social posts
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setPublishAllSocial(boolean pubAllSocial) {
            publishAllSocial = pubAllSocial;
            return this;
        }

        /**
         * Specify to do publish only for twitter.
         * @param publishTw flag to publish twitt
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setPublishTwit(boolean publishTw) {
            publishTwit = publishTw;
            return this;
        }

        /**
         * Specify Twitter consumer key.
         * @param twConsKey twitter consumer key
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setTwitterConsumerKey(String twConsKey) {
            twitterConsumerKey = twConsKey;
            return this;
        }

        /**
         * Specify Twitter Consumer secret.
         * @param twConsSecret twitter consumer secret
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setTwitterConsumerSecret(String twConsSecret) {
            twitterConsumerSecret = twConsSecret;
            return this;
        }

        /**
         * Specify Twitter Access Token.
         * @param twAccessToken twitter access token
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setTwitterAccessToken(String twAccessToken) {
            twitterAccessToken = twAccessToken;
            return this;
        }

        /**
         * Specify Access Token Secret.
         * @param twAccessTokenSecret twitter access token secret
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setTwitterAccessTokenSecret(String twAccessTokenSecret) {
            twitterAccessTokenSecret = twAccessTokenSecret;
            return this;
        }

        /**
         * Spcify Twitter Properties.
         * @param twProperties twitter properties
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setTwitterProperties(String twProperties) {
            twitterProperties = twProperties;
            return this;
        }

        /**
         * Specify to publish Xdoc update.
         * @param pubXdoc flag to publish xdoc file update
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setPublishXdoc(boolean pubXdoc) {
            publishXdoc = pubXdoc;
            return this;
        }

        /**
         * Specify to publish xdoc update and do push to remote git.
         * @param pubXdocWithPush flag to publish xdoc and push to remote repo
         * @return Builder Object
         * @noinspection ReturnOfInnerClass
         */
        public Builder setPublishXdocWithPush(boolean pubXdocWithPush) {
            publishXdocWithPush = pubXdocWithPush;
            return this;
        }

        /**
         * Verify options and set defaults.
         * @return new CliOption instance
         */
        public CliOptions build() {
            if (endRef == null) {
                endRef = "HEAD";
            }
            if (outputLocation == null) {
                outputLocation = "";
            }
            Verify.verifyNotNull(localRepoPath,
                "Path to a local git repository should not be null!");
            Verify.verifyNotNull(startRef, "Start reference should not be null!");
            Verify.verifyNotNull(releaseNumber, "Release number should not be null!");

            if ((publishAllSocial || publishTwit)
                && (twitterConsumerKey == null || twitterConsumerSecret == null
                    || twitterAccessToken == null || twitterAccessTokenSecret == null)) {
                Verify.verifyNotNull(twitterProperties, "Properties file for Twitter is expected"
                    + " if some of the following options are not entered: twitterConsumerKey, "
                    + "twitterConsumerSecret, twitterAccessToken, twitterAccessTokenSecret.");
                loadTwitterProperties();
                Verify.verifyNotNull(twitterConsumerKey, "Consumer key for Twitter is expected!");
                Verify.verifyNotNull(twitterConsumerSecret,
                    "Consumer secret for Twitter is expected!");
                Verify.verifyNotNull(twitterAccessToken, "Access token for Twitter is expected!");
                Verify.verifyNotNull(twitterAccessTokenSecret,
                    "Access token secret for Twitter is expected!");
            }

            return getNewCliOptionsInstance();
        }

        /**
         * Load options for Twitter publication from properties if they were not set.
         */
        private void loadTwitterProperties() {
            try (InputStream propStream = new FileInputStream(twitterProperties)) {
                final Properties props = new Properties();
                props.load(propStream);

                if (twitterConsumerKey == null) {
                    twitterConsumerKey =
                        props.getProperty(CliProcessor.OPTION_TWITTER_CONSUMER_KEY);
                }
                if (twitterConsumerSecret == null) {
                    twitterConsumerSecret =
                        props.getProperty(CliProcessor.OPTION_TWITTER_CONSUMER_SECRET);
                }
                if (twitterAccessToken == null) {
                    twitterAccessToken =
                        props.getProperty(CliProcessor.OPTION_TWITTER_ACCESS_TOKEN);
                }
                if (twitterAccessTokenSecret == null) {
                    twitterAccessTokenSecret =
                        props.getProperty(CliProcessor.OPTION_TWITTER_ACCESS_TOKEN_SECRET);
                }
            }
            catch (IOException ex) {
                throw new IllegalStateException("Twitter properties file has access problems"
                    + " (twitterProperties=" + twitterProperties + ')', ex);
            }
        }

        /**
         * Get new CliOptions instance.
         * @return new CliOptions instance.
         */
        private CliOptions getNewCliOptionsInstance() {
            final CliOptions cliOptions = new CliOptions();
            cliOptions.localRepoPath = localRepoPath;
            cliOptions.startRef = startRef;
            cliOptions.endRef = endRef;
            cliOptions.releaseNumber = releaseNumber;
            cliOptions.outputLocation = outputLocation;
            cliOptions.authToken = authToken;
            cliOptions.generateAll = generateAll;
            cliOptions.generateXdoc = generateXdoc;
            cliOptions.generateTw = generateTw;
            cliOptions.generateGplus = generateGplus;
            cliOptions.generateRss = generateRss;
            cliOptions.generateMlist = generateMlist;
            cliOptions.publishAllSocial = publishAllSocial;
            cliOptions.publishTwit = publishTwit;
            cliOptions.twitterConsumerKey = twitterConsumerKey;
            cliOptions.twitterConsumerSecret = twitterConsumerSecret;
            cliOptions.twitterAccessToken = twitterAccessToken;
            cliOptions.twitterAccessTokenSecret = twitterAccessTokenSecret;
            cliOptions.twitterProperties = twitterProperties;
            cliOptions.publishXdoc = publishXdoc;
            cliOptions.publishXdocWithPush = publishXdocWithPush;
            return cliOptions;
        }
    }
}
