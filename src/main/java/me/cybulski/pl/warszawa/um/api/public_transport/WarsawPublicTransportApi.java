package me.cybulski.pl.warszawa.um.api.public_transport;

import me.cybulski.pl.warszawa.um.api.public_transport.model.WarsawPublicTransportState;

/**
 * Public interface of the Warsaw Warsaw Public Transport API library.
 *
 * Used to fetch online Warsaw public transport vehicle position information.
 *
 * @author Michał Cybulski
 */
public interface WarsawPublicTransportApi {

    /**
     * Sets the user agent used for requests.
     *
     * @param userAgent UserAgent to be used
     * @return this {@link WarsawPublicTransportApi} for DSL convenience
     */
    WarsawPublicTransportApi setUserAgent(String userAgent);

    /**
     * Fetches and returns the current state of the Warsaw public transport.
     *
     * @return the current state of the Warsaw public transport
     */
    WarsawPublicTransportState getPublicTransportState();
}
