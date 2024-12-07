// src/pages/Contact.js
import React from 'react';
import { Box, Typography, Divider } from '@mui/material';

const Contact = () => {
  return (
    <Box sx={styles.container}>
      <Typography variant="h4" sx={styles.title}>Contact Information</Typography>
      <Divider sx={styles.divider} />
      <Typography variant="body1" sx={styles.info}>
        <strong>Phone:</strong> +1 123 456 7890
      </Typography>
      <Typography variant="body1" sx={styles.info}>
        <strong>Email:</strong> contact@cultureheritagehub.com
      </Typography>
      <Typography variant="body1" sx={styles.info}>
        <strong>Address:</strong> 123 Heritage St, Culture City, India
      </Typography>
    </Box>
  );
};

const styles = {
  container: {
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
    padding: '20px',
  },
  title: {
    fontWeight: 'bold',
    marginBottom: '20px',
  },
  divider: {
    margin: '10px 0',
    width: '100%',
  },
  info: {
    marginBottom: '10px',
  },
};

export default Contact;
