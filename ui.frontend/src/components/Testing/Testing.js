import React from 'react';

import {MapTo} from '@adobe/aem-react-editable-components';



export default function Testing(props) {
    console.log('Testing component props:', props);
    return (
        <div className="testing-component">
            <h1 className="tesing-component-heading">Heading: {props.label}</h1>
            <p className="testing-component-first-value">latitutide: {props.lat}</p>
            <p className="testing-component-second-value">longitutide{props.lon}</p>
        </div>
    );
}

MapTo('wknd-spa-react/components/content/testing')(Testing);